# Swarm App Lifecycle

## Using Secrets With Local Docker Compose

``` bash
docker node ls
```

``` bash
docker-compose up -d
```

``` bash
docker-compose exec psql cat /run/secrets/psql_user
```

``` bash
docker-compose 11
```

pcat docker-compose.yml

## Full App Lifecycle: Dev, Build and Deploy With a Single Compose Design

``` bash
docker-compose up -d
```

``` bash
docker inspect TAB COMPLETION
```

``` bash
docker-compose down
```

``` bash
docker-compose -f docker-compose.yml -f docker-compose.test.yml up -d
```

``` bash
docker inspect TAB COMPLETION
```

``` bash
docker-compose -f docker-compose.yml -f docker-compose.prod.yml config --help
```

``` bash
docker-compose -f docker-compose.yml -f docker-compose.prod.yml config
```

``` bash
docker-compose -f docker-compose.yml -f docker-compose.prod.yml config > output.yml
```

## Service Updates: Changing Things In Flight

``` bash
docker service create -p 8088:80 --name web nginx:1.13.7
```

``` bash
docker service ls
```

``` bash
docker service scale web=5
```

``` bash
docker service update --image nginx:1.13.6 web
```

``` bash
docker service update --publish-rm 8088 --publish-add 9090:80
```

``` bash
docker service update --force web
```

## Healthchecks in Dockerfiles

``` bash
docker container run --name p1 -d postgres
```

``` bash
docker container ls
```

``` bash
docker container run --name p2 -d --health-cmd="pg_isready -U postgres || exit 1" postgres
```

``` bash
docker container ls
```

``` bash
docker container inspect p2
```

``` bash
docker service create --name p1 postgres
```

``` bash
docker service create --name p2 --health-cmd="pg_isready -U postgres || exit 1" postgres
```
