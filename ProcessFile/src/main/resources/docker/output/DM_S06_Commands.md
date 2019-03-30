# Making It Easier with Docker Compose: The Multi-Container Tool

## Docker Compose and The Docker-compose.yml File

``` bash
docker-compose.yml
```

https://docs.docker.com

## Trying Out Basic Compose Commands

pcat docker-compose.yml

``` bash
docker-compose up
```

``` bash
docker-compose up -d
```

``` bash
docker-compose logs
```

``` bash
docker-compose --help
```

``` bash
docker-compose ps
```

``` bash
docker-compose top
```

``` bash
docker-compose down
```

## Assignment Answers: Build a Compose File for a Multi-Container Service

``` bash
docker-compose.yml
```

``` bash
docker pull drupal
```

``` bash
docker image inspect drupal
```

``` bash
docker-compose up
```

https://hub.docker.com

``` bash
docker-compose down --help
```

``` bash
docker-compose down -v
```

## Adding Image Building to Compose Files

``` bash
docker-compose.yml
```

``` bash
docker-compose up
```

``` bash
docker-compose up --build
```

``` bash
docker-compose down
```

``` bash
docker image ls
```

``` bash
docker-compose down --help
```

``` bash
docker image rm nginx-custom
```

``` bash
docker image ls
```

``` bash
docker-compose up -d
```

``` bash
docker image ls
```

``` bash
docker-compose down --help
```

``` bash
docker-compose down --rmi local
```

## Assignment Answers: Compose for Run-Time Image Building and Multi-Container Dev

``` bash
docker-compose up
```

``` bash
docker-compose down
```

``` bash
docker-compose up
```
