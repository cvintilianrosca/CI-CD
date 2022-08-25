FROM openjdk:8-jdk-alpine
MAINTAINER cvintilian-rosca

COPY target/demo-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]