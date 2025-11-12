FROM eclipse-temurin:21-jdk
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

ENV HOSTNAME=localhost
ENV EUREKA_URL=http://localhost:3150/eureka/

ENTRYPOINT ["java", "-Deureka.instance.hostname=${HOSTNAME}","-Deureka.client.serviceUrl.defaultZone=${EUREKA_URL}", "-jar", "app.jar"]

EXPOSE 3000