FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY target/security-0.0.1-SNAPSHOT.jar /app/security.jar

EXPOSE 8083

ENTRYPOINT ["java", "-jar", "/app/security.jar"]
