FROM openjdk:8-jdk-alpine
EXPOSE 9540
ARG JAR_FILE=/target/msfront-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} msfront-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/msfront-0.0.1-SNAPSHOT.jar"]