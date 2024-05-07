# Use an official Maven image from the Docker Hub
FROM maven:latest as builder

# Copy the local code to the container
COPY . /usr/src/myapp

# Set the working directory
WORKDIR /usr/src/myapp

# Run Maven build
RUN mvn clean package

# Use the official Java runtime as a base image
FROM bellsoft/liberica-openjdk-alpine:18

# Copy the JAR from the previous stage
COPY --from=builder /usr/src/myapp/target/*.jar /usr/app/myapp.jar

# Set the working directory
WORKDIR /usr/app

# Run the application
CMD ["java", "-jar", "myapp.jar"]
