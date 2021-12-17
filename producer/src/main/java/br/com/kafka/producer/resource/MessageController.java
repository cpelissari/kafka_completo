package br.com.kafka.producer.resource;

import br.com.kafka.producer.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService service;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message){
        service.sendMessage(message);
        return ResponseEntity.ok().body("Sucess sent message " + message);
    }
}