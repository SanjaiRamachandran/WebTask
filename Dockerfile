FROM eclipse-temurin:17
COPY target/webtask.jar webtask.jar
CMD [ "java","-jar","webtask.jar" ]