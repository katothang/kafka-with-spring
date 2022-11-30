package thangnotes.com.kafkaproducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Service
public class KafkaProducerService {
    @Autowired
    private KafkaTemplate kafkaTemplate;
    public Boolean sendMessage(String message) throws ExecutionException, InterruptedException, TimeoutException {
        kafkaTemplate.send("thangnotes", message).get(10000, TimeUnit.MILLISECONDS);
        return true;
    }
}
