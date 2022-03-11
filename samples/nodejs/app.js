var express = require("express");
var path = require("path");
var cookieParser = require("cookie-parser");
var logger = require("morgan");
var { initialize } = require("express-openapi");
var swaggerUi = require("swagger-ui-express");
const bodyParse = require('body-parser');
const xmlparser = require('express-xml-bodyparser');
const Kafka = require("kafkajs").Kafka


var app = express();

app.listen(3030);
app.use(logger("dev"));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(xmlparser());

swaggerDocument = require('./swagger.json');
// OpenAPI routes
initialize({
  app,
  apiDoc: require("./api/api-doc"),
  paths: "./api/paths",
});


const kafka = new Kafka({
    "clientId":"Supplier1",
    "brokers":["localhost:9092"]
})

async function run(){
    const producer = kafka.producer();
    console.log("Connection.....")
    await producer.connect()
    console.log("Connected!")

    app.post("/broker/postMessage", async (req, res) => {
        console.log("postMessage")
        console.log(req.rawBody)

        const result = await producer.send({
            "topic":"POSF.Supplier1.IN",
            "messages":[
                {
                    "value":req.rawBody
                }
            ] 
        })
        console.log(`Send successfully ${result}`)

        return res.status(200).send("");
    });

    // OpenAPI UI
    app.use(
    "/api-documentation",
    swaggerUi.serve,
    swaggerUi.setup(swaggerDocument)
    );

    console.log("App running on port http://localhost:3030");
    console.log(
    "OpenAPI documentation available in http://localhost:3030/api-documentation"
    );

}
module.exports = app;

run()