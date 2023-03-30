#!/bin/bash

set -Eexuo pipefail # https://vaneyckt.io/posts/safer_bash_scripts_with_set_euxo_pipefail/

export INITIAL_WORKING_DIRECTORY_PATH=`pwd -P`
export INITIAL_WORKING_DIRECTORY_NAME=${INITIAL_WORKING_DIRECTORY_PATH##*/}

export SCRIPT_PATH="$(
cd "$(dirname "$0")" >/dev/null 2>&1
pwd -P
)"

cd "$SCRIPT_PATH" || exit 1

# Initialize
############

cd ..
mvn clean install -U -DskipTests -T 1C;

# Run
############

mvn spring-boot:run -pl boot
