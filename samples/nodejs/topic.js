const Kafka = require("kafkajs").Kafka

async function run() {
    try 
    {
        const kafka = new Kafka({
            "clientId":"myappID1991",
            "brokers":["localhost:9092"]
        })

        const admin = kafka.admin();
        console.log("Connection.....")
        await admin.connect()
        console.log("Connected!")

        // Create sample partitions for POSF
        await createTopic(admin, "POSF.Operator1.IN")
        await createTopic(admin, "POSF.Operator1.OUT")
        await createTopic(admin, "POSF.Supplier1.IN")
        await createTopic(admin, "POSF.Supplier1.OUT")
        await createTopic(admin, "POSF.Supplier2.IN")
        await createTopic(admin, "POSF.Supplier2.OUT")
        await createTopic(admin, "POSF.WebPOSF.IN")
        await createTopic(admin, "POSF.WebPOSF.OUT")

        await admin.disconnect();

    }
    catch(ex){
        console.error(`Something bad happened ${ex}`)
    }
}

async function createTopic(admin, topicName) {
    await admin.createTopics({
        "topics" : [{
            "topic" : topicName,
            "numPartitions" : 1
        }]
    })
    console.log(`Created successfully ${topicName}`)
}

run()