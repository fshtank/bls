FROM eclipse-temurin:17
MAINTAINER fshtank@gmail.com
COPY target/bls-0.0.1-SNAPSHOT.jar docker-bls-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/bls-0.0.1-SNAPSHOT.jar"]