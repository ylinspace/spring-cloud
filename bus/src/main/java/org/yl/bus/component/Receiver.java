//package org.yl.bus.component;
//
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
///**
// * @author yang
// */
//@Component
//@RabbitListener(queues = "hello")
//@KafkaListener
//public class Receiver {
//
//    @RabbitHandler
//    public void process(String hello){
//        System.out.println("Receiver:" + hello);
//    }
//}
