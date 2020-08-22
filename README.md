# KafkaAvro
 Fazendo funcionar kafka com avro

Para conectar com o kafka é necessário subir um docker-compose.yml

version: "3.0"

services:

  zookeeper:
    image: confluentinc/cp-zookeeper:5.1.2
    restart: always
    environment:
      ZOOKEEPER_SERVER_ID: 1
      ZOOKEEPER_CLIENT_PORT: "2181"
    ports:
      - "2181:2181"
                  
  kafka1:
    image: confluentinc/cp-enterprise-kafka:5.1.2
    depends_on:
      - zookeeper
    ports:
    # Exposes 29092 for external connections to the broker
    # Use kafka1:9092 for connections internal on the docker network
    # See https://rmoff.net/2018/08/02/kafka-listeners-explained/ for details
      - "29092:29092"
    environment:
      KAFKA_ZOOKEEPER_CONNECT: "zookeeper:2181"
      KAFKA_LISTENER_SECURITY_PROTOCOL_MAP: PLAINTEXT:PLAINTEXT,PLAINTEXT_HOST:PLAINTEXT
      KAFKA_INTER_BROKER_LISTENER_NAME: PLAINTEXT
      KAFKA_ADVERTISED_LISTENERS: PLAINTEXT://kafka1:9092,PLAINTEXT_HOST://localhost:29092
      #KAFKA_LOG4J_ROOT_LOGLEVEL: INFO
      KAFKA_JMX_PORT: 9991
      
      
  schemaregistry:
    image: confluentinc/cp-schema-registry:5.1.2
    restart: always
    depends_on:
      - zookeeper
    environment:
      SCHEMA_REGISTRY_KAFKASTORE_CONNECTION_URL: "zookeeper:2181"
      SCHEMA_REGISTRY_HOST_NAME: schemaregistry
      SCHEMA_REGISTRY_LISTENERS: "http://0.0.0.0:8081"
    ports:
      - 8081:8081
      
https://github.com/confluentinc/schema-registry-workshop/blob/master/docker-compose.yml
      

Rodar o seguinte comando: docker-compose -f docker-compose.yml up
 
Ápos subir o compose é necessário acessar o terminal do kafka q vc criou no docker compose
  docker exec -it kafka1 /bin/sh

Acessar a pasta usr
acessar a pastar bin

e criar o topico
kafka-topics --create  --zookeeper zookeeper:2181  --replication-factor 1  --partitions 1  --topic test

kafka-console-producer   --broker-list localhost:9092    --topic test