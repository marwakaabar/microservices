FROM openjdk:17
EXPOSE 8082
ADD target/micro_service-0.0.1-SNAPSHOT.jar micro-service.jar
ENTRYPOINT ["java","-jar","micro-service.jar"]