# Use an official Java runtime as a parent image
FROM openjdk:22-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/ems-backend-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

ENV JWT_SECRET=aHR0cHM6Ly93d3cueW91YmlsdW1hbWVyaWNhLmNvbS9sb2dpbi8=
ENV MONGODB=mongodb+srv://jls943754:zVkOvc1KkiG9ejvY@cluster0.xtgoy.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
