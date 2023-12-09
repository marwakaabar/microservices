FROM openjdk:17
EXPOSE 8082
ADD target/microo-0.0.1-SNAPSHOT.jar microo.jar
ENTRYPOINT ["java", "-jar", "microo.jar"]