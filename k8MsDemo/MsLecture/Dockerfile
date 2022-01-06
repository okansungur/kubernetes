FROM openjdk:8-jdk-alpine
EXPOSE 9542
ARG JAR_FILE=/target/mslecture-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} mslecture-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/mslecture-0.0.1-SNAPSHOT.jar"]