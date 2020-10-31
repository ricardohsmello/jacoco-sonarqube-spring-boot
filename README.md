[![Build Status](https://travis-ci.org/ricardohsmello/jacoco-sonarqube-spring-boot.svg?branch=main)](https://travis-ci.org/ricardohsmello/jacoco-sonarqube-spring-boot)
[![Coverage Status](https://coveralls.io/repos/github/ricardohsmello/jacoco-sonarqube-spring-boot/badge.svg?branch=main)](https://coveralls.io/github/ricardohsmello/jacoco-sonarqube-spring-boot?branch=main)

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
 - Maven
 
 # Usage
## Cloning the repo

First of all we need clone the repo:
```
$ git clone https://github.com/ricardohsmello/jacoco-sonarqube-spring-boot.git
```
## Running sonarqube 

```
$ cd jacoco-sonarqube-spring-boot
$ docker-compose up -d
```

Check if sonar is up on localhost:7000 and run:

```
$ mvn sonar:sonar -Dsonar.projectKey=br.com.ricas:jacoco-sonarqube-spring-boot -Dsonar.host.url=http://localhost:7000
```

If everything its correct, the sonar will be available on: 

```
http://localhost:7000/
```

![Sonarqube](https://s1.imghub.io/9GHhS.png)

## Running jacoco

```
$ mvn clean test
$ cd jacoco-sonarqube-spring-boot/target/site/jacoco

```

![Jacoco](https://s1.imghub.io/9G6s5.png)
