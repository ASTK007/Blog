FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY target/article-0.0.1-SNAPSHOT.jar /app/article.jar

EXPOSE 8085

ENTRYPOINT ["java", "-jar", "/app/article.jar"]
