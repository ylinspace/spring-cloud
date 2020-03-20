package org.yl.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yl.feign.service.HelloService;
import vo.User;

/**
 * @author yang
 */
@RestController
@RefreshScope
public class HelloController {

    @Autowired
    HelloService helloService;

    @Value("${env:default}")
    private String env;

    @Autowired
    private Environment environment;

    @GetMapping("/hello")
    public String hello(){
//        return helloService.hello();
        return env + "----"+environment.getProperty("env");
    }

    @GetMapping("/hello1")
    public String hello1(@RequestParam String name,@RequestParam String password) {
        return helloService.hello1(name);
    }

    @GetMapping("/hello2")
    public String hello2(@RequestParam String name,@RequestParam String password){
        return helloService.hello2(name,password).toString();
    }

    @GetMapping("/hello3")
    public String hello3(@RequestParam String name,@RequestParam String password){
        return helloService.hello3(new User(name,password));
    }

}
