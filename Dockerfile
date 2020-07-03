FROM openjdk:8-jdk-alpine
MAINTAINER EmelyanovKonstantin <emelyanovkonstantin@yandex.ru>
ADD ./target/geoproxy.jar /app/
CMD ["java","-jar","/app/geoproxy.jar"]
EXPOSE 8589