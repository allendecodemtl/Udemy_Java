# Container Images, Where To Find Them and How To Build Them

## The Mighty Hub: Using Docker Hub Registry Images

http://hub.docker.com

``` bash
docker image ls
```

``` bash
docker pull nginx
```

``` bash
docker pull nginx:1.11.9
```

``` bash
docker pull nginx:1.11
```

``` bash
docker pull nginx:1.11.9-alpine
```

``` bash
docker image ls
```

## Images and Their Layers: Discover the Image Cache

``` bash
docker image ls
```

``` bash
docker history nginx:latest
```

``` bash
docker history mysql
```

``` bash
docker image inspect nginx
```

## Image Tagging and Pushing to Docker Hub

``` bash
docker image tag -- help
```

``` bash
docker image ls
```

``` bash
docker pull mysql/mysql-server
```

``` bash
docker image ls
```

``` bash
docker pull nginx:mainline
```

``` bash
docker image ls
```

``` bash
docker image tag nginx bretfisher/nginx
```

``` bash
docker image tag --help
```

``` bash
docker image ls
```

``` bash
docker image push bretfisher/nginx
```

``` bash
docker --help
```

``` bash
docker login
```

cat .docker/config.json

``` bash
docker image push bretfisher/nginx
```

``` bash
docker image push bretfisher/nginx bretfisher/nginx:testing
```

``` bash
docker image ls
```

``` bash
docker image push bretfisher/nginx:testing
```

``` bash
docker image ls
```

## Building Images: The Dockerfile Basics

cd dockerfile-sample-1

vim Dockerfile

## Building Images: Running Docker Builds

``` bash
docker image build -t customnginx .
```

``` bash
docker image ls
```

``` bash
docker image build -t customnginx .
```

## Building Images: Extending Official Images

cd dockerfile-sample-2

vim Dockerfile

``` bash
docker container run -p 80:80 --rm nginx
```

``` bash
docker image build -t nginx-with-html .
```

``` bash
docker container run -p 80:80 --rm nginx-with-html
```

``` bash
docker image ls
```

``` bash
docker image tag --help
```

``` bash
docker image tag nginx-with-html:latest bretfisher/nginx-with-html:latest
```

``` bash
docker image ls
```

``` bash
docker push
```

## Assignment Answers: Build Your Own Dockerfile and Run Containers From It

cd dockerfile-assignment-1

vim Dockerfile

``` bash
docker build cmd
```

``` bash
docker build -t testnode .
```

``` bash
docker container run --rm -p 80:3000 testnode
```

``` bash
docker images
```

``` bash
docker tag --help
```

``` bash
docker tag testnode bretfisher/testing-node
```

``` bash
docker push --help
```

``` bash
docker push bretfisher/testing-node
```

``` bash
docker image ls
```

``` bash
docker image rm bretfisher/testing-node
```

``` bash
docker container run --rm -p 80:3000 bretfisher/testing-node
```
