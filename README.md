# spring-rabbitmq-producer
Template de rabbitmq de exchange topic, para testes de mensagens.

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


