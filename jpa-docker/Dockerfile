# Use the official Java image.
FROM openjdk:24-ea-16-jdk-slim-bullseye
VOLUME /tmp

ENV DATABASE_URL=jdbc:postgresql://postgres:5432/mydb
ENV DATABASE_USER=myuser
ENV DATABASE_PASSWORD=mypassword


COPY target/*.war app.war
ENTRYPOINT ["java","-jar","/app.war"]