#!/usr/bin/env bash
set -euo pipefail

# Compare Maven Surefire test execution totals between two revisions.
#
# Usage:
#   scripts/compare-test-totals.sh [BASE_REF] [HEAD_REF]
#
# Defaults:
#   BASE_REF: origin/main (or main if origin/main not found)
#   HEAD_REF: HEAD (current checkout)
#
# Notes:
# - Uses git worktree to create a clean checkout for BASE_REF under ./.worktrees/base
# - Runs tests with project-recommended options:
#     MAVEN_OPTS: -Xms3g -Xmx6g -Djdk.xml.xpathExprGrpLimit=500 -Djdk.xml.xpathExprOpLimit=500
#     Maven args: -B -Dmaven.javadoc.skip=true -PskipBundlePlugin,minimal-fix-latest test
# - Sums tests, failures, errors, skipped across all modules from Surefire XML reports
# - Prints a summary table and exits non-zero if totals differ
# - Requires Java 8 on PATH (will warn if not JDK 8)

BASE_REF=${1:-}
HEAD_REF=${2:-HEAD}

if [[ -z "${BASE_REF}" ]]; then
  if git show-ref --verify --quiet refs/remotes/origin/main; then
    BASE_REF="origin/main"
  else
    BASE_REF="main"
  fi
fi

# Ensure we're at repo root (script lives in scripts/)
SCRIPT_DIR=$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd)
REPO_ROOT=$(cd -- "${SCRIPT_DIR}/.." && pwd)
cd "${REPO_ROOT}"

# Check Java version (warn only)
if command -v java >/dev/null 2>&1; then
  JAVA_VER=$(java -version 2>&1 | head -n1 | sed -E 's/.*version "([^"]+)".*/\1/')
  case "${JAVA_VER}" in
    1.8.*|8*) : ;; # ok
    *) echo "[warn] Java version is ${JAVA_VER}. The project requests JDK 8 for this check." >&2 ;;
  esac
else
  echo "[warn] java not found on PATH; proceeding but Maven will likely fail." >&2
fi

# Maven options per project guidelines
export MAVEN_OPTS="-Xms3g -Xmx6g -Djdk.xml.xpathExprGrpLimit=500 -Djdk.xml.xpathExprOpLimit=500"
MVN_CMD=("./mvnw" -B -Dmaven.javadoc.skip=true -PskipBundlePlugin,minimal-fix-latest test)

WORKTREES_DIR="${REPO_ROOT}/.worktrees"
BASE_DIR="${WORKTREES_DIR}/base"

cleanup() {
  set +e
  if [[ -d "${BASE_DIR}" ]]; then
    git worktree remove --force "${BASE_DIR}" >/dev/null 2>&1 || true
    rm -rf "${BASE_DIR}" >/dev/null 2>&1 || true
  fi
}
trap cleanup EXIT

mkdir -p "${WORKTREES_DIR}"

# Add worktree for base
if [[ -d "${BASE_DIR}" ]]; then
  git worktree remove --force "${BASE_DIR}" >/dev/null 2>&1 || true
  rm -rf "${BASE_DIR}"
fi

echo "[info] Preparing base worktree at ${BASE_DIR} for ${BASE_REF}"
git fetch --all --prune --tags >/dev/null 2>&1 || true
# Use --detach to avoid creating a new branch
git worktree add --detach "${BASE_DIR}" "${BASE_REF}" >/dev/null

# Function to run tests and collect totals
run_and_collect() {
  local dir="$1"
  local label="$2"
  echo "[info] Running tests for ${label} in ${dir}"
  (cd "${dir}" && "${MVN_CMD[@]}" >/dev/null)

  # Find all Surefire XML suite reports and sum attributes
  # We prefer files named TEST-*.xml (per-class), but also include top-level *-suite.xml if present.
  local xml_files
  # shellcheck disable=SC2207
  xml_files=($(find "${dir}" -type f \( -path "*/target/surefire-reports/TEST-*.xml" -o -path "*/target/surefire-reports/*-suite.xml" -o -path "*/target/surefire-reports/*.xml" \) -print))

  if [[ ${#xml_files[@]} -eq 0 ]]; then
    echo "tests=0 failures=0 errors=0 skipped=0"; return 0
  fi

  awk 'BEGIN{tests=0;fail=0;err=0;skip=0}
       /<testsuite /{
          if(match($0, /tests="([0-9]+)"/, a)) tests+=a[1];
          if(match($0, /failures="([0-9]+)"/, a)) fail+=a[1];
          if(match($0, /errors="([0-9]+)"/, a)) err+=a[1];
          if(match($0, /skipped="([0-9]+)"/, a)) skip+=a[1];
       }
       END{printf("tests=%d failures=%d errors=%d skipped=%d\n", tests, fail, err, skip)}' "${xml_files[@]}"
}

# Base
BASE_SUMMARY=$(run_and_collect "${BASE_DIR}" "BASE:${BASE_REF}")
BASE_TESTS=$(echo "${BASE_SUMMARY}" | awk '{for(i=1;i<=NF;i++){split($i,a,"="); if(a[1]=="tests") print a[2]}}')
BASE_FAIL=$(echo   "${BASE_SUMMARY}" | awk '{for(i=1;i<=NF;i++){split($i,a,"="); if(a[1]=="failures") print a[2]}}')
BASE_ERR=$(echo    "${BASE_SUMMARY}" | awk '{for(i=1;i<=NF;i++){split($i,a,"="); if(a[1]=="errors") print a[2]}}')
BASE_SKIP=$(echo   "${BASE_SUMMARY}" | awk '{for(i=1;i<=NF;i++){split($i,a,"="); if(a[1]=="skipped") print a[2]}}')

# Head (current checkout or provided ref via another worktree when not HEAD)
HEAD_DIR="${REPO_ROOT}"
if [[ "${HEAD_REF}" != "HEAD" ]]; then
  # create a transient worktree for explicit HEAD_REF so current tree remains untouched
  HEAD_DIR="${WORKTREES_DIR}/head"
  git worktree add --detach "${HEAD_DIR}" "${HEAD_REF}" >/dev/null
fi

HEAD_SUMMARY=$(run_and_collect "${HEAD_DIR}" "HEAD:${HEAD_REF}")
HEAD_TESTS=$(echo "${HEAD_SUMMARY}" | awk '{for(i=1;i<=NF;i++){split($i,a,"="); if(a[1]=="tests") print a[2]}}')
HEAD_FAIL=$(echo   "${HEAD_SUMMARY}" | awk '{for(i=1;i<=NF;i++){split($i,a,"="); if(a[1]=="failures") print a[2]}}')
HEAD_ERR=$(echo    "${HEAD_SUMMARY}" | awk '{for(i=1;i<=NF;i++){split($i,a,"="); if(a[1]=="errors") print a[2]}}')
HEAD_SKIP=$(echo   "${HEAD_SUMMARY}" | awk '{for(i=1;i<=NF;i++){split($i,a,"="); if(a[1]=="skipped") print a[2]}}')

# If we created a HEAD worktree, ensure it gets cleaned as well on exit
if [[ -d "${WORKTREES_DIR}/head" ]]; then
  trap 'git worktree remove --force "${WORKTREES_DIR}/head" >/dev/null 2>&1 || true; cleanup' EXIT
fi

# Print summary
printf "\nTest totals (summed across modules)\n"
printf "%-12s %10s %10s %10s %10s\n" "Ref" "Tests" "Failures" "Errors" "Skipped"
printf "%-12s %10d %10d %10d %10d\n" "BASE" "${BASE_TESTS}" "${BASE_FAIL}" "${BASE_ERR}" "${BASE_SKIP}"
printf "%-12s %10d %10d %10d %10d\n" "HEAD" "${HEAD_TESTS}" "${HEAD_FAIL}" "${HEAD_ERR}" "${HEAD_SKIP}"

DT=$(( HEAD_TESTS - BASE_TESTS ))
DF=$(( HEAD_FAIL  - BASE_FAIL  ))
DE=$(( HEAD_ERR   - BASE_ERR   ))
DS=$(( HEAD_SKIP  - BASE_SKIP  ))

printf "%-12s %10s %10s %10s %10s\n" "Δ(HEAD-BASE)" "${DT}" "${DF}" "${DE}" "${DS}"

# Exit non-zero if overall test count differs
if [[ ${DT} -ne 0 ]]; then
  echo "\n[fail] Test count changed by ${DT} (HEAD=${HEAD_TESTS}, BASE=${BASE_TESTS})." >&2
  exit 1
fi

# Also flag if failures/errors increased
if [[ ${DF} -gt 0 || ${DE} -gt 0 ]]; then
  echo "\n[warn] Failures/errors increased (Δfailures=${DF}, Δerrors=${DE})." >&2
fi

echo "\n[ok] Test totals match between ${BASE_REF} and ${HEAD_REF}."
