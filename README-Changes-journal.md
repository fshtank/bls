# BLS Data Demo Update Journal

This is some of the work I had to do bring this project into a more up-to-date Spring Boot version

Update the Application.yml 
change `spring.profile` to
```
  spring:
    config:
        activate:
            on-profile:
```

Add a JDBC Dialect:
- Following this [Stack Overflow article](https://stackoverflow.com/questions/61851491/spring-data-jdbc-firebird-dialect-not-recognized)
- and I Removed it: Derby not supported
  - - Giving up on this. Moving to MariaDB, PostgreSQL
- Dockerize Postgres Database and create a bls_data DB in it (See below)

# Dockerized Version
  - Docker giving a Malware warning
  - reinstalled [new version 4.37.20](https://docs.docker.com/desktop/cert-revoke-solution/#upgrade-to-docker-desktop-version-4372-recommended) with fixes

### DOCKER POSTGRES :
```
docker run -d --name postgres -p 5432:5432 -e POSTGRES_PASSWORD='mypasswordsecret' postgres
```
- 1/25 thru 1/26 Dockerize Postgres, remove Derby DB dependency

### DOCKERIZE APP
- Merged Jan 2025 branch into Master as running application
- adding "DOCKERFILE"
- Documented [docs.docker build process](https://docs.docker.com/get-started/docker-concepts/building-images/build-tag-and-publish-an-image/)
  - Publish Image to dockerhub
  - also look to GitHub container registry

### Build with eclipse-temurin
- eclipse-temurin OPEN JDK reference: https://hub.docker.com/_/eclipse-temurin/
` docker build -t fshtank/bls-build-image-demo .`

### Tagging :
`docker build -t fshtank/bls-build-image-demo:beta-001 .`

### Delete an image (if needed)
`docker rmi fshtank/bls-build-image-demo`

# Docker Hub
My `fshtank` repo
https://hub.docker.com/u/fshtank 

### Push image to Docker Hub
`docker push fshtank/bls-build-image-demo:beta-001`


