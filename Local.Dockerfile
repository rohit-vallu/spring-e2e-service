FROM amazoncorretto:17 as builder

# Set the working directory inside the container
WORKDIR /app

# Copy the entire project into the container
COPY . .

# Build the application using Gradle
# Executes the ./gradlew build command inside the /app directory within the container
RUN ./gradlew build

# Finds the non-plain JAR file in the build output and copies it to /app/libs with the name spring-e2e-service.jar
RUN mkdir -p /app/libs && \
    find ./build/libs -name "*.jar" ! -name "*-plain.jar" -exec cp {} /app/libs/spring-e2e-service.jar \;

EXPOSE 9090

ENTRYPOINT ["java", "-Xms512m", "-Xmx2048m", "-jar", "/app/libs/spring-e2e-service.jar"]