FROM openjdk:8
ADD target/microservice-payment-service-0.0.1-SNAPSHOT.jar payment.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","payment.jar"]