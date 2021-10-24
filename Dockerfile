FROM openjdk:11
COPY HelloWorld.class .
ENTRYPOINT ["java","HelloWorld"]
