#!/bin/bash
process_array=$(ps -ef |grep weed |grep port | awk '{print $2}')
echo going to stop processes $process_array
if [ -n "$process_array" ]; then
    kill -15 $process_array
else
    echo no process to stop!
fi
