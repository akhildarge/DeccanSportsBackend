# define base docker image
FROM openjdk:11

LABEL maintainer="com.cybage"

ADD target/Deccan-Sports-Club.jar springboot-docker-demo.jar

ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]