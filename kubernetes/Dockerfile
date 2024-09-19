FROM openjdk:17
RUN mkdir /app

WORKDIR /app
COPY target/bootdocker.jar app.jar

EXPOSE 8080
CMD ["java","-jar","app.jar"]