# React.js and Spring Data REST | Spring Guide

- Spring Guide | https://spring.io/guides/tutorials/react-and-spring-data-rest/
- Source repo | https://github.com/spring-guides/tut-react-and-spring-data-rest
- Frontend Maven Plugin for managing node.js and npm | https://github.com/eirslett/frontend-maven-plugin
- Application-Level Profile Semantics | http://alps.io/
  - format returned by:
  - `curl http://localhost:8080/api/profile/employees -H "Accept:application/schema+json"`

# Run

Watch for changes to JS, CSS and run webpack:

`.\target\node\npm run-script watch`

Run Spring Boot:

`./mvnw spring-boot::run`

# View

http://localhost:8080

# Create Employees

`http post localhost:8080/api/employees firstName=Bob lastName=Builder description=the`

# Pagination

`http://localhost:8080/api/employees?size=2`

# SonarQube Scanning

[SonarQube](SonarQube.md)
