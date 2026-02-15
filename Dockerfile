FROM maven:3.9.9-eclipse-temurin-17

WORKDIR /app

COPY pom.xml ./
COPY src ./src

ENV DEMOQA_USERNAME=""
ENV DEMOQA_PASSWORD=""

CMD ["mvn", "clean", "test"]
