FROM amazoncorretto:17-alpine3.17

LABEL maintainer = "awambengrodrick@gmail.com"

WORKDIR /app

COPY target/serving-web-content-0.0.1-SNAPSHOT.jar .

COPY run.sh .

RUN chmod +x run.sh

CMD ["sh", "run.sh"]

