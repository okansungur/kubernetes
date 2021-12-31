FROM openjdk:8-jdk-alpine
EXPOSE 1999
ARG JAR_FILE=/kubedemo/target/kubedemo-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} kubedemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/kubedemo-0.0.1-SNAPSHOT.jar"]