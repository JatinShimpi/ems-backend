# Use an official Java runtime as a parent image
FROM openjdk:22-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/ems-backend-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

ENV JWT_SECRET=<redacted>
ENV MONGODB=<redacted>

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
