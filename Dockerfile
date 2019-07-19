FROM openjdk:8-jre-alpine
ADD target/appsdev2-microservices-mysql-initiative.jar appsdev2-microservices-mysql-initiative.jar
EXPOSE 9002
CMD exec java -jar appsdev2-microservices-mysql-initiative.jar