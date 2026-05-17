# AGENTS.md

This file provides guidance for automated contributors/agents working in the `quickfix-j/quickfixj` repository.

## 1) Scope

- Keep changes minimal and surgical.
- Avoid unrelated refactors or broad formatting-only edits.
- Prefer module-focused changes and include only files needed for the task.

## 2) Environment

- Use the repository Maven wrapper: `./mvnw` (or `./mvnw.cmd` on Windows), not system Maven.
- Java compatibility target is Java 8 (`maven.compiler.source=8`, `maven.compiler.target=8`).
- CI validates multiple Java versions and OSes (JDK 8/11/21 on Linux, macOS, and Windows).

## 3) Build instructions (fast/default/full)

- Fast local package (no tests):
  - `./mvnw clean package -Dmaven.javadoc.skip=true -DskipTests -PskipBundlePlugin,minimal-fix-latest`
- CI-equivalent validation baseline:
  - `./mvnw install -Dmaven.javadoc.skip=true -PskipBundlePlugin,minimal-fix-latest`
- If OSGi bundle artifacts are required, omit `-PskipBundlePlugin`.

## 4) Module dependency order for targeted `quickfixj-core` work

From a clean checkout, for targeted `quickfixj-core` tests/builds:

1. Build orchestration/resources first (`quickfixj-orchestration`).
2. Build required message artifacts, at least:
   - `quickfixj-messages-fixt11`
   - `quickfixj-messages-all`
   - `quickfixj-messages-fixlatest`
3. Build/test `quickfixj-core` (typically with `-am` when selecting modules).

This avoids missing generated resources/classes during targeted core runs.

## 5) Testing expectations

- Run module-local tests first for the area you changed.
- Run broader reactor checks when changes cross module boundaries or affect shared build/generation logic.
- For bug fixes/features, add or adjust tests where applicable.

## 6) Code style

- Follow surrounding code style and import ordering in edited files.
- Java formatting reference profile:
  - `quickfixj-core/src/main/eclipse/formatter.xml`
- The formatter profile uses 4-space indentation, K&R-style braces, and does not auto-reformat comments.

## 7) Safety and contribution rules

- Never commit secrets, credentials, or private keys.
- Avoid changing generated/build-heavy modules unless required by the task.
- Keep PRs focused and explain why non-default build profiles/options were used.
