package org.yl.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yang
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() throws Exception{
        System.out.println("Hello !");
        return "Hello eureka!";
    }

}
