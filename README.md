# jacoco-sonarqube-spring-boot
A simple test application with sonar+jacoco+spring-boot

# Built With
- Java 11
- Spring-boot
- Sonarqube
- Jacoco


# Prerequisites
 - Docker-Compose
 - JVM 11 
 
 # Usage
## Cloning the repo

First of all we need clone the repo:
```
git clone https://github.com/ricardohsmello/magalu-schedule.git
```
## Running sonarqube

Now, we need to up our **sonarqube** container. For this, if you don't have an instance running, you can use this to up by using a docker-compose file. On jacoco-sonarqube-spring-boot directory, run;
```
docker-compose up
```

If everything its correct, the sonar will be available on: 
```
http://localhost:7000/
```

 mvn sonar:sonar -Dsonar.projectKey=br.com.ricas:ricas-financas -Dsonar.host.url=http://localhost:7000
Type the follow URL on browser
```
http://localhost:8080/
```
