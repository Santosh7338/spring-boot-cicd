FROM openjdk:18.0-slim
ADD target/spring-boot-docker.jar spring-boot-docker.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]