# spring-rabbitmq-producer
Template de rabbitmq de exchange topic, para testes de publicação de mensagens.

## Requisitos
- [Java 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) / [OpenJDK 8](https://openjdk.java.net/install/)
- [Maven](https://maven.apache.org/download.cgi)
- [Lombok](https://projectlombok.org/) 
- [Eclipse](https://www.eclipse.org/downloads/) /[InteliJ](https://www.jetbrains.com/idea/download/#section=linux)
- [Docker](https://www.docker.com/)

## Variáveis
- exchange - nome da exchange

## Docker
Para testes antes é necessário executar o comando abaixo para executar o rabbitmq: 
```
$ docker-compose up -d
```

## RabbitMQ Management
```
http://localhost:15672/
```

## Testes de publicação de mensagens
Importe o curl abaixo no postman

```
curl --location --request POST 'localhost:8081/send' \
--header 'Content-Type: application/json' \
--data-raw '{ 
	"type": "type.orderfinish",
	"text":"mensagem de teste"
	
}'
```

## Consumidor
Importante clonar também o [repositorio](https://github.com/leandro-yamaniha/spring-rabbitmq-consumer) para testes em conjunto com consumidor de mensagens.

## Links
https://www.rabbitmq.com/tutorials/tutorial-five-java.html
http://next.rabbitmq.com/documentation.html
https://www.cloudamqp.com/blog/2015-09-03-part4-rabbitmq-for-beginners-exchanges-routing-keys-bindings.html
http://adolfoeloy.com/rabbitmq/amqp/2016/09/07/rabbitmq-study.pt.html
