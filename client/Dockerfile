FROM node:13.8.0

WORKDIR /app

ENV PATH /app/node_modules/.bin:$PATH

COPY package.json /app/package.json

RUN npm install

COPY . .

ENTRYPOINT ["ng","serve","--host", "0.0.0.0"]