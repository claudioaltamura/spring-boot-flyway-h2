FROM eclipse-temurin:21-alpine

WORKDIR /app

COPY target/spring-boot-flyway-h2-0.0.1-SNAPSHOT.jar /app/messages.jar

ENTRYPOINT ["java", "-jar", "messages.jar"]