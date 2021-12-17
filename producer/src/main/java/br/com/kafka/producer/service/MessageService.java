package br.com.kafka.producer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private static final Logger log = LoggerFactory.getLogger(MessageService.class);

    @Value("${topic.kafka-docker}")
    private String topic;

    @Autowired
    KafkaTemplate<String, String> template;

    public void sendMessage(String message){
        log.info("Send Produces Message -> " + message);
        template.send(topic, message);
    }

}
