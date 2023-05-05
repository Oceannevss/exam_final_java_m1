FROM nginx
COPY dist/. /usr/share/nginx/html/
RUN apt update -y && apt install vim -y
RUN touch application.yaml
WORKDIR /app
EXPOSE 80