FROM openjdk:17

WORKDIR /app

COPY target/Week_3B-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

CMD ["java", "-jar", "Week_3B-0.0.1-SNAPSHOT.jar", "spring.profiles.active=docker"]