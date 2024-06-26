FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/payroll-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar", "/app.jar"]