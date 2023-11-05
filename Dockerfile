FROM openjdk:17
EXPOSE 8081
ADD target/devops-integration-2.5.5.jar devops-integration-2.5.5.jar
ENTRYPOINT ["java","-jar","/devops-integration-2.5.5.jar"]