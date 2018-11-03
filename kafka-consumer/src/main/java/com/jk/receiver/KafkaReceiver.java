package com.jk.receiver;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class KafkaReceiver {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @KafkaListener(topics = {"test2"})
    public void listen(ConsumerRecord record){
        Object value = record.value();
        Optional<Object> kafkaMessage = Optional.ofNullable(value);
        if (kafkaMessage.isPresent()){
            Object message = kafkaMessage.get();
            System.out.println(record);
            System.out.println(message);
        }

    }
}
