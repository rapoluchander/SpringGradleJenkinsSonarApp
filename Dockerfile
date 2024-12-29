FROM openjdk:17-jdk-slim
COPY build/libs/SpringGradleJenkinsSonarApp-0.0.1-SNAPSHOT.jar gradle-jenkins.jar
ENTRYPOINT ["java", "-jar", "/gradle-jenkins.jar"]
