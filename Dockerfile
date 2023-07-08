FROM openjdk:11

ADD target/PollsApplication.jar PollsApplication.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "PollsApplication.java"]