
FROM java:8
VOLUME /temp
ADD /client-1.0-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","/app.jar"]
