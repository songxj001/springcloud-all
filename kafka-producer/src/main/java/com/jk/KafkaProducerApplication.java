package com.jk;

import com.jk.send.KafkaSend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KafkaProducerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(KafkaProducerApplication.class, args);
        KafkaSend kafkaSend = context.getBean(KafkaSend.class);
        for (int i = 0; i < 100; i++) {
            kafkaSend.send();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
