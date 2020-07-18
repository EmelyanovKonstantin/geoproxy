FROM openjdk:8-jdk-alpine
ADD ./target/geoproxy.jar /app/
CMD ["java","-jar","/app/geoproxy.jar"]
EXPOSE 8589