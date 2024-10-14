FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY pom.xml pom.xml
COPY jpa jpa
COPY backend_homefoodrestaurantapp_322 backend_homefoodrestaurantapp_322
RUN mvn clean package -DnoTest=true

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/backend_homefoodrestaurantapp_322/target/homefoodrestaurantapp-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar homefoodrestaurantapp-0.0.1-SNAPSHOT.jar"]