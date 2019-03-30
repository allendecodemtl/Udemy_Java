# Swarm Basic Features and How to Use Them In Your Workflow

## Scaling Out with Overlay Networking

``` bash
docker network create --driver overlay mydrupal
```

``` bash
docker network ls
```

``` bash
docker service create --name psql --network mydrupal -e POSTGRES_PASSWORD=mypass postgres
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

## Scaling Out with Routing Mesh

``` bash
docker service create --name search --replicas 3 -p 9200:9200 elasticsearch:2
```

``` bash
docker service ps search
```

## Assignment Answers: Create a Multi-Service Multi-Node Web App

``` bash
docker node ls
```

``` bash
docker service ls
```

``` bash
docker network create -d overlay backend
```

``` bash
docker network create -d overlay frontend
```

``` bash
docker service create --name vote -p 80:80 --network frontend -- replica 2 COPY IMAGE
```

``` bash
docker service create --name redis --network frontend --replica 1 redis:3.2
```

``` bash
docker service create --name worker --network frontend --network backend COPY IMAGE
```

``` bash
docker service create --name db --network backend COPY MOUNT INFO
```

``` bash
docker service create --name result --network backend -p 5001:80 COPY INFO
```

``` bash
docker service ls
```

``` bash
docker service ps result
```

``` bash
docker service ps redis
```

``` bash
docker service ps db
```

``` bash
docker service ps vote
```

``` bash
docker service ps worker
```

cat /etc/docker/

``` bash
docker service logs worker
```

``` bash
docker service ps worker
```

## Swarm Stacks and Production Grade Compose

``` bash
docker stack deploy -c example-voting-app-stack.yml voteapp
```

``` bash
docker stack
```

``` bash
docker stack ls
```

``` bash
docker stack ps voteapp
```

``` bash
docker container ls
```

``` bash
docker stack services voteapp
```

``` bash
docker stack ps voteapp
```

``` bash
docker network ls
```

``` bash
docker stack deploy -c example-voting-app-stack.yml voteapp
```

## Using Secrets in Swarm Services

``` bash
docker secret create psql_usr psql_usr.txt
```

echo "myDBpassWORD" | docker secret create psql_pass - TAB COMPLETION

``` bash
docker secret ls
```

``` bash
docker secret inspect psql_usr
```

``` bash
docker secret create --name psql --secret psql_user --secret psql_pass -e POSTGRES_PASSWORD_FILE=/run/secrets/psql_pass -e POSTGRES_USER_FILE=/run/secrets/psql_user postgres
```

``` bash
docker service ps psql
```

``` bash
docker exec -it psql.1.CONTAINER NAME bash
```

``` bash
docker logs TAB COMPLETION
```

``` bash
docker service ps psql
```

``` bash
docker service update --secret-rm
```

## Using Secrets with Swarm Stacks

vim docker-compose.yml

``` bash
docker stack deploy -c docker-compose.yml mydb
```

``` bash
docker secret ls
```

``` bash
docker stack rm mydb
```

## Assignment Answers: Create A Stack with Secrets and Deploy

vim docker-compose.yml

``` bash
docker stack deploy - c docker-compose.yml drupal
```

echo STRING |docker secret create psql-ps - VALUE

``` bash
docker stack deploy -c docker-compose.yml drupal
```

``` bash
docker stack ps drupal
```
