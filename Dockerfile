FROM maven:3.9.16-eclipse-temurin-25-alpine
WORKDIR /app
COPY ./hola-mundo/pom.xml ./pom.xml
RUN mvn dependency:go-offline
COPY ./hola-mundo/src ./src
RUN mvn package
CMD ["java", "-cp", "target/hola-mundo-1.0-SNAPSHOT.jar", "uam.prog3.App"]
