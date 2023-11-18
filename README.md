# docker-complete-tutorial

For WIndows
Install From:-
  https://docs.docker.com/desktop/install/windows-install/
  
  Karnel:-
  https://wslstorestorage.blob.core.windows.net/wslblob/wsl_update_x64.msi

## Docker
Docker is a popular platform used for containerization. It allows developers to package their applications and their dependencies into a standardized unit called a container. Containers are lightweight, isolated, and portable, making it easier to deploy and run applications consistently across different environments.

Here are some key reasons why Docker is widely used:

* **Portability**: Docker containers encapsulate the application and its dependencies, including libraries, frameworks, and system tools. This ensures that the application runs consistently across different environments, such as development, testing, and production. Developers can build and test applications locally and then deploy them to any environment without worrying about compatibility issues.

* **Isolation**: Docker containers provide a high level of isolation, allowing applications to run independently without interfering with each other. Each container has its own file system, network interfaces, and process space, ensuring that changes made within a container do not affect other containers or the host system. This isolation improves security and stability.

* **Efficiency**: Docker uses a layered file system and image caching, which enables efficient resource utilization. Docker images are built using layers, and if multiple images share the same layers, they are reused, reducing the storage space required. Additionally, containers start quickly because they only need to run the processes defined in the image, rather than booting up an entire operating system.

* **Scalability**: Docker makes it easy to scale applications horizontally by running multiple containers of the same image across different hosts or in a cluster. This allows applications to handle increased traffic and workload by distributing the load across multiple containers.

* **Collaboration**: Docker simplifies collaboration among developers and teams. Docker images can be shared and distributed through container registries, allowing developers to easily share their applications and collaborate on projects. This promotes consistency and reproducibility across different development environments.

## Docker Engine
Docker Engine is the runtime that runs and manages containers created with Docker. It's the underlying client-server technology that builds and runs containers. Docker Engine includes the Docker CLI command line interface, and the API which can be used to interact with the Docker daemon.

Docker Engine has three components:

* **Server**: The Docker daemon, called dockerd, is a persistent process that manages Docker containers and handles container objects.

* **REST API**: The Docker daemon exposes a REST API for programs to talk to the daemon and instruct it what to do.

* **Command Line Interface (CLI)**: The Docker CLI, docker, is a command line interface that interacts with the Docker daemon through scripting or direct CLI commands. Most of the Docker CLI commands are for creating, managing and removing Docker containers and images.

Docker Engine supports different storage drivers, network interfaces, and plugins, allowing it to be used with a wide variety of operating systems and cloud providers. It's also responsible for Docker's security features like container isolation.
## Docker objects

Docker has several objects that are used to build, ship, and run applications. Here are the main ones:

* **Images**: Docker images are read-only templates that contain a set of instructions for creating a container that can run on the Docker platform. They are created from a set of layers that are built upon each other to produce a final image.

* **Containers**: A container is a runnable instance of an image. You can create, start, stop, move, or delete a container using the Docker API or CLI. Each container is isolated from other containers and its host machine.

* **Services**: In a distributed application, different pieces of the app are called “services”. For example, if you have a video-sharing site, it probably includes a service for storing application data in a database, a service for video transcoding in the background after a user uploads something, a service for the front-end, and so on. Services are really just “containers in production.”

* **Volumes**: Volumes are the preferred mechanism for persisting data generated by and used by Docker containers. While bind mounts are dependent on the directory structure of the host machine, volumes are completely managed by Docker.

* **Networks**: Docker’s networking subsystem is pluggable, using drivers. Several networks drivers exist out of the box, and provide core networking functionality.

* **Dockerfile**: A Dockerfile is a text file that contains all the commands, in order, needed to build a given image. Dockerfiles are a set of instructions that Docker uses to build an image automatically.

* **Docker** Compose: Docker Compose is a tool for defining and running multi-container Docker applications. With Compose, you use a YAML file to configure your application’s services.

## Container
A container is a standard unit of software that packages up code and all its dependencies so the application runs quickly and reliably from one computing environment to another. A Docker container image is a lightweight, standalone, executable package that includes everything needed to run a piece of software, including the code, a runtime, libraries, environment variables, and config files.

Containers are designed to be portable and consistent across environments. They isolate the software from its surroundings, for example, differences between development

## Image/Container
```
docker images
docker pull ubuntu
docker run -it -d --name mycontainer1 -p 80:80 ubuntu
docker exec -ti mycontainer1 bash
apt install nginx -y
service nginx status | service nginx start | service nginx restart | service nginx stop
docker stop 0e0bfe32b9e0
docker kill 0e0bfe32b9e0
docker restart 0e0bfe32b9e0
docker rm bb10a05dafcc
docker rm -f bb10a05dafcc
docker commit 6a8267b3e542 ubuntu-nginx
```
## Docker Volums

In Docker, volumes are a way to persist data generated by and used by Docker containers. They allow you to share data between a host system and Docker containers, as well as between different containers.

Here are some key points about Docker volumes:

**Data Persistence**: Volumes are used to persist data even if the container is stopped or removed. This is essential for applications that generate or rely on data that should persist beyond the lifespan of a container.

``` 
docker run -v /host/path:/container/path myimage
```

**Mounting Volumes**: You can mount a volume into a Docker container by specifying it in the docker run command with the -v or --volume option. For example:

```
docker volume create myvolume
docker run -v myvolume:/container/path myimage
```

**Named Volumes**: Docker also supports named volumes, which are managed by Docker and can be more convenient to use. You can create a named volume with the docker volume create command, and then reference it in your docker run command:
```
docker volume create myvolume
docker run -v myvolume:/container/path myimage
```


**Docker Compose**: If you are using Docker Compose to define and run multi-container Docker applications, you can specify volumes in your docker-compose.yml file:
```
version: '3'
services:
  myservice:
    image: myimage
    volumes:
      - /host/path:/container/path

```

docker tag ubuntu-nginx sushant968/ubuntu-nginx-image
docker push sushant968/ubuntu-nginx-image

# Dockerfile
FROM:

Purpose: Specifies the base image to use for the build.
Syntax: FROM <image>[:<tag>] [AS <name>]
WORKDIR:

Purpose: Sets the working directory for subsequent instructions.
Syntax: WORKDIR /path/to/directory
COPY:

Purpose: Copies files from the host machine to the container.
Syntax: COPY <src>... <dest>
RUN:

Purpose: Executes a command during the build process. It is often used to install software or dependencies.
Syntax: RUN <command>
EXPOSE:

Purpose: Informs Docker that the container will listen on the specified network ports at runtime.
Syntax: EXPOSE <port> [<port>/<protocol>...]
ENV:

Purpose: Sets environment variables in the image.
Syntax: ENV <key>=<value>
CMD:

Purpose: Provides defaults for an executing container. It can be overridden when running a container.
Syntax:
CMD ["executable","param1","param2"] (exec form)
CMD command param1 param2 (shell form)
LABEL:

Purpose: Adds metadata to the image.
Syntax: LABEL <key>=<value> [<key>=<value>...]
USER:

Purpose: Sets the username or UID to use when running the image.
Syntax: USER <username | UID>[:<group | GID>]
ADD:

Purpose: Similar to COPY but has additional features. It can copy local files, remote files, and extract compressed files.
Syntax: ADD <src>... <dest>
ARG:

Purpose: Defines a variable that users can pass at build-time to the builder.
Syntax: ARG <name>[=<default>]
VOLUME:

Purpose: Creates a mount point for externally mounted volumes or other containers.
Syntax: VOLUME ["/data"]
HEALTHCHECK:

Purpose: Defines a command to check the health of a container.
Syntax: HEALTHCHECK [OPTIONS] CMD command
RUN (shell form):

Purpose: Similar to the earlier RUN instruction but uses a shell for executing the command.
Syntax: RUN command
SHELL:

Purpose: Allows the default shell used for the shell form of commands to be overridden.
Syntax: SHELL ["executable", "parameters"]
STOPSIGNAL:

Purpose: Sets the system call signal that will be sent to the container to stop it.
Syntax: STOPSIGNAL signal
ONBUILD:

Purpose: Adds a trigger instruction to the image that will be executed at a later time when used as the base for another build.
Syntax: ONBUILD [INSTRUCTION]
ENTRYPOINT:

Purpose: Configures a container to run as an executable.
Syntax: ENTRYPOINT ["executable", "param1", "param2"]
COPY (with --from):

Purpose: Copies files or directories from another image during the build process.
Syntax: COPY --from=source <src>... <dest>
WORKDIR (multiple):

Purpose: Allows you to change the working directory multiple times in a single Dockerfile.
Syntax: WORKDIR /path/to/directory
