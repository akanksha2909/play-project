FROM ingensi\play-framework:latest

RUN yum install git && yum install ca-certificates
RUN mkdir /usr/src/app
WORKDIR /usr/src/app
COPY . /usr/src/app

CMD ['activator', 'run']

EXPOSE 9000

