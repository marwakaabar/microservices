FROM openjdk:17
EXPOSE 9090
ADD target/gestionArticle-0.0.1-SNAPSHOT.jar gestionArticle.jar
ENTRYPOINT ["java","-jar","gestionArticle.jar"]