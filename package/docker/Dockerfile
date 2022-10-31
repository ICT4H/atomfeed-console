FROM amazoncorretto:8
COPY package/docker/resources/application.yml.template .
COPY package/docker/resources/start.sh .
COPY package/docker/resources/*.jar .
RUN yum install -y gettext
EXPOSE 9080
RUN chmod +x start.sh 
ENTRYPOINT ["./start.sh"]