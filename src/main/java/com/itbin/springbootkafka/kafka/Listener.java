package com.itbin.springbootkafka.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by LIBIN on 2019/1/11 17:05
 * Description:
 */
@Component("listener")
public class Listener {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @KafkaListener(topics = {"notice"})
    public void listen(ConsumerRecord<?, ?> record,Acknowledgment ack) {
        logger.info("kafka的key: " + record.key());
        logger.info("kafka的value: " + record.value().toString());
        logger.info("kafka的offset: " + record.offset());
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            System.out.println("listen1 " + message);
            //对消息的处理
        }
        ack.acknowledge();
    }
}
