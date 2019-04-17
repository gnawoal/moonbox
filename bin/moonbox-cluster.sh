#!/usr/bin/env bash

moonbox_home_dir="$(cd "`dirname "$0"`/.."; pwd)"
if [ -f "${moonbox_home_dir}/conf/moonbox-env.sh" ]; then
  . "${moonbox_home_dir}/conf/moonbox-env.sh"
fi

java -Dlog4j.configuration="file:$MOONBOX_HOME/conf/log4j.properties" -cp "$MOONBOX_HOME/libs/*"  moonbox.rest.MoonboxCluster "$@"