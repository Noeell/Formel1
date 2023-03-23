FROM openjdk:16

# Set the working directory to /app
WORKDIR /app

# Copy the JAR file and other required files to the container
COPY target/formel1-docker.jar formel1-docker.jar

# Expose port 8080 to the host machine
EXPOSE 8080

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "formel1-docker.jar"]