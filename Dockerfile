# Use an OpenJDK base image
FROM openjdk:17-jdk-slim

# Add a volume pointing to /tmp
VOLUME /tmp

# Copy the jar to the container
COPY target/*.jar app.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/app.jar"]
