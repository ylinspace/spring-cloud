package org.yl.bus.component;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Component;

/**
 * @author yang
 */
@Component
public class MyKafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = {"hello"},groupId = "myContainer1")
    public void listener(ConsumerRecord<String,String> record){
        System.out.println(record.toString());
    }
}
