FROM openjdk:11-jre-alpine

EXPOSE 8080

COPY ./var/lib/jenkins/workspace/java-maven-app/target/java-maven-app-*.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "java-maven-app-1.0-SNAPSHOT.jar"]
