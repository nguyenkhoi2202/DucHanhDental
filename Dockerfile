# Stage 1: Build ứng dụng bằng Maven
FROM eclipse-temurin:17-jdk-alpine AS build

WORKDIR /app

# Copy toàn bộ mã nguồn vào container
COPY . .

# Build project và tạo file JAR
RUN ./mvnw clean package -DskipTests

# Stage 2: Chạy ứng dụng
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copy file JAR từ stage build sang stage run
COPY --from=build /app/target/*.jar app.jar

# Expose cổng Spring Boot
EXPOSE 8080

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
