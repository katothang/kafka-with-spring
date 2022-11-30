package thangnotes.com.kafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import thangnotes.com.kafkaproducer.service.KafkaProducerService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

@RestController
@RequestMapping("kafka")
public class KafkaProducerController {
    @Autowired
    KafkaProducerService kafkaProducerService;

    @GetMapping("send")
    public Boolean sendMessage(@RequestParam String message) throws ExecutionException, InterruptedException, TimeoutException {
        return kafkaProducerService.sendMessage(message);
    }
}
