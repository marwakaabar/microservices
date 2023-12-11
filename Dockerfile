FROM openjdk:17
EXPOSE 9099
ADD target/gestionHotel-0.0.1-SNAPSHOT.jar gestionHotel.jar
ENTRYPOINT ["java","-jar","gestionHotel.jar"]
