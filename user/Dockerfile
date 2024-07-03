FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY target/user-0.0.1-SNAPSHOT.jar /app/user.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "/app/user.jar"]
