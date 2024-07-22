FROM openjdk:17-alpine
ARG JAR_FILE=target/userregistrationSystem-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} userregistrationsystem:1.0
ENTRYPOINT ["java","-jar","/userregistrationsystem.jar"]