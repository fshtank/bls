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

