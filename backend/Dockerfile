FROM maven:3.8.4-openjdk-11-slim AS build
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM openjdk:17

COPY ./target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
