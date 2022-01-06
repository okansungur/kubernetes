FROM openjdk:8-jdk-alpine
EXPOSE 9541
ARG JAR_FILE=/target/msstudent-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} msstudent-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/msstudent-0.0.1-SNAPSHOT.jar"]