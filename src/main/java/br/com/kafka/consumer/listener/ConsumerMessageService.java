package br.com.kafka.consumer.listener;

import org.apache.kafka.common.protocol.types.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerMessageService {
    private static Logger logger = LoggerFactory.getLogger(ConsumerMessageService.class);

    @KafkaListener(topics = "${topic.kafka-docker}", groupId = "group_id")
    public void consumeMessage(String message){
        logger.info("Consumer Message -> " + message);
    }

}
