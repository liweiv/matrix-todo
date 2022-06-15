FROM openjdk:11-jre-slim
ENV TZ Asia/Shanghai
WORKDIR /app/srv
COPY "todo-boot/target/todo-boot-0.0.1-SNAPSHOT.jar" "./todo.jar"
ENTRYPOINT ["java", "-jar", "./todo.jar"]