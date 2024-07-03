FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY target/gateway-0.0.1-SNAPSHOT.jar /app/gateway.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "/app/gateway.jar"]
