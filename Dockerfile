FROM alpine:3.11.2
RUN apk add --no-cache openjdk11
COPY build/libs/microservice-bootcamp-0.0.1-SNAPSHOT.jar /app
WORKDIR /app/
RUN mv /app/*.jar /app/app.jar
CMD ["java", "-jar", "app.jar"]


