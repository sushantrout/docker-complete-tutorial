FROM openjdk:24-ea-16-jdk-slim-bullseye

# Copy the jar file to the container
COPY target/*.war app.war

CMD ["java", "-jar", "app.war"]