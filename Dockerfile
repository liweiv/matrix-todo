FROM openjdk:11-jre-slim
WORKDIR srv
COPY "target/todo-0.0.1-SNAPSHOT.jar" "./todo.jar"
ENTRYPOINT ["java", "-jar", "./todo.jar"]