# docker-complete-tutorial

For WIndows
Install From:-
  https://docs.docker.com/desktop/install/windows-install/
  
  Karnel:-
  https://wslstorestorage.blob.core.windows.net/wslblob/wsl_update_x64.msi

Docker is a popular platform used for containerization. It allows developers to package their applications and their dependencies into a standardized unit called a container. Containers are lightweight, isolated, and portable, making it easier to deploy and run applications consistently across different environments.

Here are some key reasons why Docker is widely used:

* Portability: Docker containers encapsulate the application and its dependencies, including libraries, frameworks, and system tools. This ensures that the application runs consistently across different environments, such as development, testing, and production. Developers can build and test applications locally and then deploy them to any environment without worrying about compatibility issues.

* Isolation: Docker containers provide a high level of isolation, allowing applications to run independently without interfering with each other. Each container has its own file system, network interfaces, and process space, ensuring that changes made within a container do not affect other containers or the host system. This isolation improves security and stability.

* Efficiency: Docker uses a layered file system and image caching, which enables efficient resource utilization. Docker images are built using layers, and if multiple images share the same layers, they are reused, reducing the storage space required. Additionally, containers start quickly because they only need to run the processes defined in the image, rather than booting up an entire operating system.

* Scalability: Docker makes it easy to scale applications horizontally by running multiple containers of the same image across different hosts or in a cluster. This allows applications to handle increased traffic and workload by distributing the load across multiple containers.

* Collaboration: Docker simplifies collaboration among developers and teams. Docker images can be shared and distributed through container registries, allowing developers to easily share their applications and collaborate on projects. This promotes consistency and reproducibility across different development environments.

## Image
```
docker images
docker pull postgres
docker rmi <image-id>
docker rmi <image-name>
docker history
docker inspect image 
docker search
docker image prune -> Remove all the unused images in docker.
```
## Container
```
docker ps
docker ps -a
docker inspect fae
docker logs <container-id>
docker logs -f <container-id> -- folow the logs
docker rm <container-id>
```
