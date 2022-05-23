FROM openjdk:11-jre-slim
ENV TZ Asia/Shanghai
WORKDIR srv
COPY "target/todo-0.0.1-SNAPSHOT.jar" "./todo.jar"
ENTRYPOINT ["java", "-jar", "./todo.jar"]