FROM openjdk:17-jdk-slim
COPY target/*.jar gradle-jenkins.jar
ENTRYPOINT ["java", "-jar", "/gradle-jenkins.jar"]
