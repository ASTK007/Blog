FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY target/category-0.0.1-SNAPSHOT.jar /app/category.jar

EXPOSE 8084

ENTRYPOINT ["java", "-jar", "/app/category.jar"]
