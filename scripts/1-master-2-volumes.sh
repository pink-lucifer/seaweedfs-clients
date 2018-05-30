#!/bin/bash
BIN_WEED=$HOME/software/seaweedfs/weed
WEED_DIR=$HOME/software/seaweedfs

function start_master {
    nohup $BIN_WEED -log_dir="$WEED_DIR/logs/master" master -mdir="$WEED_DIR/data/master" -ip="172.16.88.71" -port=9003 -ip.bind="172.16.88.71" > $WEED_DIR/logs/weed.log 2>&1 &
}

function start_volume1 {
    nohup $BIN_WEED -log_dir="$WEED_DIR/logs/volume1" volume -dir="$WEED_DIR/data/volume1" -ip="172.16.88.71" -port=9004 -ip.bind="172.16.88.71" -mserver="172.16.88.71:9003" > $WEED_DIR/logs/weed.log 2>&1 &
}

function start_volume2 {
    nohup $BIN_WEED -log_dir="$WEED_DIR/logs/volume2" volume -dir="$WEED_DIR/data/volume2" -ip="172.16.88.71" -port=9005 -ip.bind="172.16.88.71" -mserver="172.16.88.71:9003" > $WEED_DIR/logs/weed.log 2>&1 &
}

function start_filer {
    nohup $BIN_WEED -log_dir="$WEED_DIR/logs/filer" filer -dir="$WEED_DIR/data/filer" -ip="172.16.88.71" -port=9006 -port.public 9007 -master="172.16.88.71:9003" > $WEED_DIR/logs/weed.log 2>&1 &
}

function quit {
    exit 2
}

function start_rest {
    for i in `seq 1 100`;
    do
        count=$(netstat -anp|grep 9003|grep -ic weed)
        if [ $count -gt 0 ]; then
            start_volume1
            start_volume2
            start_filer
            break
        else
            sleep 0.1s
        fi
    done
}

cd $WEED_DIR
# master
start_master
sleep 0.1s
start_rest



