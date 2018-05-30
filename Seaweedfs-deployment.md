# Deployment for seaweedfs

## simplest deployment
- Download binary from [github release page](https://github.com/chrislusf/seaweedfs/releases)
```bash
cd $HOME/software/seaweedfs/
wget https://github.com/chrislusf/seaweedfs/releases/download/0.77/linux_amd64.tar.gz
tar -zxvf  linux_amd64.tar.gz
```
- prepare for script
```bash
cd $HOME/software/seaweedfs/
mkdir  -p data/master data/volume1 data/volume2 data/filer logs/master logs/volume1 logs/volume2 logs/filer sbin
```
- run scripts [1-master-2-volumes.sh](./scripts/1-master-2-volumes.sh)
```
$ tail -100f  ../logs/weed.log 
I0530 19:29:36 18154 file_util.go:20] Folder /home/lufs/software/seaweedfs/data/volume2 Permission: -rwxrwxr-I0530 19:29:36 18155 filer.go:121] Start Seaweed filer server 0.77 public at 172.16.88.71:9007
I0530 19:29:36 18155 filer_server.go:121] Filer server bootstraps with master 172.16.88.71:9003
I0530 19:29:36 18155 filer.go:133] Start Seaweed FileI0530 19:29:40 18138 master_server.go:92] [ 172.16.88.71:9003 ] 172.16.88.71:9003 becomes leader.
I0530 19:29:41 18138 node.go:223] topo adds child DefaultDataCenter
I0530 19:29:41 18138 node.go:223] topo:DefaultDataCenter adds child DefaultRack
I0530 19:29:41 18138 node.go:223] topo:DefaultDataCenter:DefaultRack adds child 172.16.88.71:9005
I0530 19:29:41 18138 master_grpc_server.go:36] added volume server 172.16.88.71:9005
I0530 19:29:41 18138 node.go:223] topo:DefaultDataCenter:DefaultRack adds child 172.16.88.71:9004
I0530 19:29:41 18138 master_grpc_server.go:36] added volume server 172.16.88.71:9004
```
- stop scripts [stopAll.sh](./scripts/stopAll.sh)