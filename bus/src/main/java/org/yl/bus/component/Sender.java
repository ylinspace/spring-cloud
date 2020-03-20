//package org.yl.bus.component;
//
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
///**
// * @author yang
// */
//@Component
//public class Sender {
//
//    @Autowired
//    private AmqpTemplate rabbitTemplate;
//
//    public void send(){
//        String context = "Hello Rabbit !" + new Date();
//        System.out.println("Sender : " + context);
//        this.rabbitTemplate.convertAndSend("hello",context);
//    }
//}
