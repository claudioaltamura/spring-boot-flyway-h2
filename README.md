![GitHub Workflow Status (with branch)](https://img.shields.io/github/actions/workflow/status/claudioaltamura/spring-boot-flyway-h2/maven-build.yml?branch=main)

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

# spring-boot-flyway-h2 
Demo project for Spring Boot with H2, Flyway and Docker

## Build
    
    mvn clean package

    docker build -t messages:v1.0 . 

## Run

    docker run -d -it -p 8080:8080 messages:v1.0
    
## Stop 

    docker ps

    docker stop <container-id>


## Test

    curl http://localhost:8080/messages