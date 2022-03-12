import atexit
from ctypes import *
CDLL("C:/Users/user/anaconda3/Lib/site-packages/confluent_kafka.libs/librdkafka-5d2e2910.dll")
from confluent_kafka import Producer
from confluent_kafka import Consumer
from confluent_kafka.admin import AdminClient, NewTopic
from flask import Flask, request
from flasgger import Swagger, LazyString, LazyJSONEncoder
from flasgger import swag_from


producer_conf = {'bootstrap.servers': "192.168.88.180:9092",
        'client.id': 'myClientId'}

producer = Producer(producer_conf)

consumer_conf = {'bootstrap.servers': '192.168.88.180:9092',
        'group.id': "fooABC",
        'enable.auto.commit': False,
        'auto.offset.reset': 'earliest'
        }

consumer = Consumer(consumer_conf)
consumer.subscribe(["POSF.Supplier1.IN"])

admin = AdminClient({'bootstrap.servers': "192.168.88.180:9092"})
new_topics = [NewTopic(topic, num_partitions=3, replication_factor=1) for topic in ["POSF.Supplier1.IN", "POSF.Supplier1.OUT", "POSF.Operator1.IN", "POSF.Operator1.OUT"]]
admin.create_topics(new_topics)

app = Flask(__name__)
app.config["SWAGGER"] = {"title": "POSF testing Swagger-UI", "uiversion": 2}

swagger_config = {
    "headers": [],
    "specs": [
        {
            "endpoint": "apispec_1",
            "route": "/apispec_1.json",
            "rule_filter": lambda rule: True,  # all in
            "model_filter": lambda tag: True,  # all in
        }
    ],
    "static_url_path": "/flasgger_static",
    # "static_folder": "static",  # must be set by user
    "swagger_ui": True,
    "specs_route": "/swagger/",
}

template = dict(
    swaggerUiPrefix=LazyString(lambda: request.environ.get("HTTP_X_SCRIPT_NAME", ""))
)

app.json_encoder = LazyJSONEncoder
swagger = Swagger(app, config=swagger_config, template=template)


@app.route("/")
def index():
    return "POSF API Demo"


@app.route("/broker/postMessage", methods=["POST"])
@swag_from("docs/postMessage.yml") 
def broker_post_messsage(): 
    producer.produce("POSF.Supplier1.IN", key="key", value=request.data)
    producer.flush()
    return "OK"

@app.route("/broker/poolMessage", methods=["GET"])
@swag_from("docs/poolMessage.yml") 
def broker_pool_messsage(): 

    msg = consumer.poll(timeout=1.0)
    if msg is None: return "NONE"

    if msg.error():
        if msg.error().code() == KafkaError._PARTITION_EOF:
            # End of partition event
            sys.stderr.write('%% %s [%d] reached end at offset %d\n' %
                                (msg.topic(), msg.partition(), msg.offset()))
        elif msg.error():
            raise KafkaException(msg.error())
    else:
        return msg.value(),200,{'kafka-offset':msg.offset()}


@app.route("/broker/commit", methods=["POST"])
@swag_from("docs/commit.yml") 
def broker_commit(): 
    global consumer
    consumer.commit()
    return "OK",200


@app.route("/place/<code>", methods=["GET"])
@swag_from("docs/place.yml") 
def place_get(code): 
    return "<place><address><city><code>54984</code><name>Cluj</name></city><county>RO</county><extended></extended><number>1</number><street>Strada Avram Iancu</street></address><code>{}</code><technicalData><counterSeries>12123321</counterSeries><counterType>GAS</counterType><date>2001-08-13</date><number>332</number><smartMeter>true</smartMeter><status>CONECTAT</status></technicalData><type>CLC</type></place>".format(code),200

def close():
    global consumer
    consumer.close()

atexit.register(close)


app.run()


