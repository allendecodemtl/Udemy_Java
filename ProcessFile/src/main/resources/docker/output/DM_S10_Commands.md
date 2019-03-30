# Container Registries: Image Storage and Distribution

## Docker Hub: Digging Deeper

https://hub.docker.com

## Docker Store: What Is It For?

https://store.docker.com

## Docker Cloud: CI/CD and Server Ops

https://cloud.docker.com

https://hub.docker.com

## Understanding Docker Registry

https://github.com/docker/distribution

https://hub.docker.com/registry

## Run a Private Docker Registry

``` bash
docker container run -d -p 5000:5000 --name registry registry
```

``` bash
docker container ls
```

``` bash
docker image ls
```

``` bash
docker pull hello-world
```

``` bash
docker run hello-world
```

``` bash
docker tag hello-world 127.0.0.1:5000/hello-world
```

``` bash
docker image ls
```

``` bash
docker push 127.0.0.1:5000/hello-world
```

``` bash
docker image remove hello-world
```

``` bash
docker image remove 127.0.0.1:5000/hello-world
```

``` bash
docker container rm admiring_stallman
```

``` bash
docker image remove 127.0.0.1:5000/hello-world
```

``` bash
docker image ls
```

``` bash
docker pull 127.0.0.1:5000/hello-world:latest
```

``` bash
docker container kill registry
```

``` bash
docker container rm registry
```

``` bash
docker container run -d -p 5000:5000 --name registry -v $(pwd)/registry-data:/var/lib/registry registry TAB COMPLETION
```

``` bash
docker image ls
```

``` bash
docker push 127.0.0.1:5000/hello-world
```

## Using Docker Registry With Swarm

http://play-with-docker.com

``` bash
docker node ls
```

``` bash
docker service create --name registry --publish 5000:5000 registry
```

``` bash
docker service ps registry
```

``` bash
docker pull hello-world
```

``` bash
docker tag hello-world 127.0.0.1:5000/hello-world
```

``` bash
docker push 127.0.0.1:5000/hello-world
```

``` bash
docker pull nginx
```

``` bash
docker tag nginx 127.0.0.1:5000/nginx
```

``` bash
docker push 127.0.0.1:5000/nginx
```

``` bash
docker service create --name nginx -p 80:80 --replicas 5 --detach=false 127.0.0.1:5000/nginx
```

``` bash
docker service ps nginx
```
