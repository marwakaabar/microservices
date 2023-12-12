FROM openjdk:17
EXPOSE 9079
ADD target/gestionHotel-0.0.1-SNAPSHOT.jar gestionHotel.jar
ENTRYPOINT ["java","-jar","gestionHotel.jar"]
