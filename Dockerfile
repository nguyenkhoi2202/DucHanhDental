# Sử dụng image Java 17 nhẹ nhất
FROM eclipse-temurin:17-jdk-alpine

# Đặt thư mục làm việc trong container
WORKDIR /app

# Copy file JAR từ thư mục target vào container
COPY target/*.jar app.jar

# Expose cổng mà Spring Boot chạy
EXPOSE 8080

# Lệnh chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
