FROM maven:3.6.3-jdk-13 as builder

WORKDIR /app

COPY pom.xml /app/pom.xml

RUN mvn dependency:go-offline -B

COPY . /app

RUN mvn clean install -DskipTests

FROM openjdk:11.0.5-jre as runner

COPY --from=builder /app/target/htmlComparator-0.0.1-SNAPSHOT.jar /app/

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/htmlComparator-0.0.1-SNAPSHOT.jar"]
