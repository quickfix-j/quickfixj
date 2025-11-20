#!/bin/bash
set -euo pipefail
cd "$(dirname "$0")"
./mvnw clean verify -Dmaven.test.skip=false -B
