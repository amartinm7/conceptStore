FROM openjdk:8-jdk-alpine

MAINTAINER Antonio Martin

EXPOSE 8080

COPY build/libs/lib/*.jar build/libs/*.jar /usr/local/conceptStore/

WORKDIR /usr/local/conceptStore

CMD java -Xmx512m -cp "*" org.springframework.boot.loader.JarLauncher