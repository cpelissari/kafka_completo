# kafka_completo: 
Estudo de mensageria utilizando kafka, criação de producer e consumer

Tecnologias utilizadas:
Spring boot,
Docker,
Kafka.

Ambiente:
Windows utilizando wsl2(windows 10 ou acima):
https://docs.docker.com/desktop/windows/install/

Resumos dos estudos:
1- Criação do Producer:
MessageController faz chamada do MessageService. 

Sobre o serviço :
utiliza anotação @Value (Spring) onde é passado o nome do tópido do kafka por parâmetro
instância do KafkaTemplate (Spring) que é um mapper de chave e valor de String. A partir dele pode-se utilizar o método send conforme abaixo:

template.send(topic, message);


2- Arquivo de configuração do docker:
Criado o arquivo: docker-compose.yml
Nele constam todos os serviços que a aplicação poderá utilizar, por as imagens do kafka, do kafdrop (para monitorar a fila e visualizar o que está sendo produzido e consumido com maior facilidade).

Obs: docker utiliza o zookeper(apache) para sincronizar configurações entre diferentes clusters.

Para subir a aplicação:
docker compose up
