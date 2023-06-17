FROM openjdk:11

COPY target/RestDocket.jar /usr/app/RestDocket.jar

WORKDIR /usr/app

ENTRYPOINT ["java","-jar","RestDocket.jar"]