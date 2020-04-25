FROM openjdk:8
ADD target/calc-1.0-SNAPSHOT.jar calc-1.0-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "calc-1.0-SNAPSHOT.jar", "com.calculator.calculator"]