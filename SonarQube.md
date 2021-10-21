# SonarQube Commands and Local Credentials

Replace `TOKEN` or use an environment variable.

# Linux

```bash
mvn clean verify sonar:sonar \
  -Dsonar.projectKey=Java-App-Test \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=TOKEN
```

# Powershell

Backtick is line continuation character.

`./mvnw clean verify sonar:sonar '-Dsonar.projectKey=Java-App-Test' '-Dsonar.host.url=http://localhost:9000' '-Dsonar.login=TOKEN'`