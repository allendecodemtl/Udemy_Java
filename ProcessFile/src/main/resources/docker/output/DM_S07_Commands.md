# Swarm Intro and Creating a 3-Node Swarm Cluster

## Create Your First Service and Scale it Locally

``` bash
docker info
```

``` bash
docker swarm init
```

``` bash
docker node ls
```

``` bash
docker node --help
```

``` bash
docker swarm --help
```

``` bash
docker service --help
```

``` bash
docker service create alpine ping 8.8.8.8
```

``` bash
docker service ls
```

``` bash
docker service ps frosty_newton
```

``` bash
docker container ls
```

``` bash
docker service update TAB COMPLETION --replicas 3
```

``` bash
docker service ls
```

``` bash
docker service ps frosty_newton
```

``` bash
docker update --help
```

``` bash
docker service update --help
```

``` bash
docker container ls
```

``` bash
docker container rm -f frosty_newton.1.TAB COMPLETION
```

``` bash
docker service ls
```

``` bash
docker service ps frosty_newton
```

``` bash
docker service rm frosty_newton
```

``` bash
docker service ls
```

``` bash
docker container ls
```

## Creating a 3-Node Swarm Cluster

http://play-with-docker.com

``` bash
docker info
```

``` bash
docker-machine
```

``` bash
docker-machine create node1
```

``` bash
docker-machine ssh node1
```

``` bash
docker-machine env node1
```

``` bash
docker info
```

http://get.docker.com

``` bash
docker swarm init
```

``` bash
docker swarm init --advertise-addr TAB COMPLETION
```

``` bash
docker node ls
```

``` bash
docker node update --role manager node2
```

``` bash
docker node ls
```

``` bash
docker swarm join-token manager
```

``` bash
docker node ls
```

``` bash
docker service create --replicas 3 alpine ping 8.8.8.8
```

``` bash
docker service ls
```

``` bash
docker node ps
```

``` bash
docker node ps node2
```

``` bash
docker service ps sleepy_brown
```

## Scaling Out with Overlay Networking

``` bash
docker network create --driver overlay mydrupal
```

``` bash
docker network ls
```

``` bash
docker service create --name psql --netowrk mydrupal -e POSTGRES_PASSWORD=mypass postgres
```

``` bash
docker service ls
```

``` bash
docker service ps psql
```

``` bash
docker container logs psql TAB COMPLETION
```

``` bash
docker service create --name drupal --network mydrupal -p 80:80 drupal
```

``` bash
docker service ls
```

watch docker service ls

``` bash
docker service ps drupal
```

``` bash
docker service inspect drupal
```
