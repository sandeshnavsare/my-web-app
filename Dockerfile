From tomcat:9.0.104-jdk17

# Remove the older build file
RUN rn -rf /opt/apache-tomcat-9.0.104/webapps/my-web-app-1.0-SNAPSHOT.war

COPY /target/my-web-app-1.0-SNAPSHOT.war /opt/apache-tomcat-9.0.104/webapps/

EXPOSE 8010
