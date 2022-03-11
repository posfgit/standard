const Kafka = require("kafkajs").Kafka
var o2x = require('object-to-xml');

async function run() {
    try 
    {
        const kafka = new Kafka({
            "clientId":"myappID199144",
            "brokers":["localhost:9092"]
        })

        const consumer = kafka.consumer({"groupId":"testers8"})
        console.log("Connection.....")
        await consumer.connect()
        console.log("Connected!")

        await consumer.subscribe({
            "topic":"POSF.Supplier1.IN",
            "fromBeginning":true,
        })
        
        
        await consumer.run({
            "eachMessage":async result => {
                console.log(result.message.value.toString())
            }
        })

    }
    catch(ex){
        console.error(`Something bad happened ${ex}`)
    }
}

run()