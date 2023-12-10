FROM openjdk:8
EXPOSE 8282
ADD target/Offre_MS-0.0.1-SNAPSHOT.jar Offre_MS-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "Offre_MS-0.0.1-SNAPSHOT.jar"]