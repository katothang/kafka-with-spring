package thangnotes.com.kafkaconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "thangnotes")
    public void consumnerMessage(String message) {
        System.out.println("message="+message);

    }
}
