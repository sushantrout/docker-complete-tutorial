# docker-complete-tutorial

For WIndows
Install From:-
  https://docs.docker.com/desktop/install/windows-install/
  
  Karnel:-
  https://wslstorestorage.blob.core.windows.net/wslblob/wsl_update_x64.msi

## Image
docker images
docker pull postgres
docker rmi <image-id>
docker rmi <image-name>
docker history
docker inspect image 
docker search
## docker image prune -> Remove all the unused images in docker.
docker ps
docker ps -a
docker inspect fae
docker logs <container-id>
docker logs -f <container-id> -- folow the logs
docker rm <container-id>




docker ps | findstr /i "notification"
docker ps --filter "name=mongo"
docker ps -a
