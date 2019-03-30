# Container Lifetime & Persistent Data: Volumes, Volumes, Volumes

## Persistent Data: Data Volumes

``` bash
docker pull mysql
```

``` bash
docker image inspect mysql
```

``` bash
docker container run -d --name mysql -e MYSQL_ALLOW_EMPTY_PASSWORD=True mysql
```

``` bash
docker container ls
```

``` bash
docker container inspect mysql
```

``` bash
docker volume ls
```

``` bash
docker volume inspect TAB COMPLETION
```

``` bash
docker container run -d --name2 mysql -e MYSQL_ALLOW_EMPTY_PASSWORD=True mysql
```

``` bash
docker volume ls
```

``` bash
docker container stop mysql
```

``` bash
docker container stop mysql2
```

``` bash
docker container ls
```

``` bash
docker container ls -a
```

``` bash
docker volume ls
```

``` bash
docker container rm mysql mysql2
```

``` bash
docker volume ls
```

``` bash
docker container run -d --name mysql -e MYSQL_ALLOW_EMPTY_PASSWORD=True -v mysql-db:/var/lib/mysql mysql
```

``` bash
docker volume ls
```

``` bash
docker volume inspect mysql-db
```

``` bash
docker container rm -f mysql
```

``` bash
docker container run -d --name mysql3 -e MYSQL_ALLOW_EMPTY_PASSWORD=True -v mysql-db:/var/lib/mysql mysql
```

``` bash
docker volume ls
```

``` bash
docker container inspect mysql3
```

``` bash
docker volume create --help
```

## Persistent Data: Bind Mounting

cd dockerfile-sample-2

pcat Dockerfile

``` bash
docker container run -d --name nginx -p 80:80 -v $(pwd):/usr/share/nginx/html nginx
```

``` bash
docker container run -d --name nginx2 -p 8080:80 nginx
```

``` bash
docker container exec -it nginx bash
```

## Assignment Answers: Edit Code Running In Containers With Bind Mounts

``` bash
docker run -p 80:4000 -v $(pwd):/site bretfisher/jekyll-serve
```
