const Kafka = require("kafkajs").Kafka

async function run() {
    try 
    {
        const kafka = new Kafka({
            "clientId":"myappID1991",
            "brokers":["localhost:9092"]
        })

        const producer = kafka.producer();
        console.log("Connection.....")
        await producer.connect()
        console.log("Connected!")

        const result = await producer.send({
            "topic":"POSF",
            "messages":[
                {
                    "value":"<anre:PlaceCreatedByOperator>6</anre:PlaceCreatedByOperator>"
                }
            ] 
        })
        console.log(`Send successfully ${result}`)
        await producer.disconnect();

    }
    catch(ex){
        console.error(`Something bad happened ${ex}`)
    }
}

run()