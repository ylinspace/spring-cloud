package org.yl.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yang
 */
@RestController
public class HelloController {

//    @Autowired
//    private Sender sender;

    @Autowired
    private KafkaTemplate kafkaTemplate;
//
//    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
//    public String hello() throws Exception{
//        sender.send();
//
//        return "The message has been sent!";
//    }

    @RequestMapping(value = "/send",method = RequestMethod.GET)
    public String sendMessageToKafka(@RequestParam String msg){
        kafkaTemplate.send("hello",null);
        return "success!";
    }

//    public static void main(String [] args) throws Exception{
//        ConnectionFactory conn = new ConnectionFactory();
//        conn.setHost("viptest.top");
//        conn.setPassword("yanglin");
//        conn.setUsername("springcloud");
//        conn.setPort(15672);
//        conn.newConnection();
//    }
}
