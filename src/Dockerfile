# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Add metadata to the image
LABEL authors="keyinstudent"

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file (assuming you've already built it via Maven/Gradle)
COPY target/golfclub.jar app.jar

# Make port 8080 available to the world outside the container
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
