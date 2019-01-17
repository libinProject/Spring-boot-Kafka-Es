package com.itbin.springbootkafka.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.itbin.springbootkafka.data.dao.MessageDto;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

/**
 * Created by LIBIN on 2019/1/13 18:43
 * Description:
 */
@RestController
@RequestMapping(value = "/kafka")
public class SendController {

    private static Gson gson = new GsonBuilder().create();

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @GetMapping(value = "/send")
    public void send(@RequestParam(value = "topic") String topic,@RequestParam(value = "key") String key){

        MessageDto dto=new MessageDto();
        dto.setId("1");
        dto.setDate(new Timestamp(System.currentTimeMillis()));
        dto.setName("kafka test");
        kafkaTemplate.send(topic,key,gson.toJson(dto));
    }
}
