package org.yl.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.*;
import vo.User;

import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

/**
 * @author yang
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass().getName());

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/hello")
    public String hello() throws Exception{
        String result = "Hello Spring Cloud Server !";
        System.out.println(result);
//        List<String> ss = client.getServices();
//        ServiceInstance instance = client.getInstances(ss.get(0)).get(0);
//        System.out.println(ss.toString());
//        System.out.println(instance.getHost()+instance.getInstanceId()+instance.getScheme()+instance.getMetadata().toString()+instance.getPort()+instance.getUri());

        return result;
    }

    @PostMapping("/user")
    public User ribbon() throws Exception{
        Thread.sleep(new Random().nextInt(3000));
        User user = new User("张三","11111");

        return user;
//        return "";
    }

    @RequestMapping(value = "/hello1" ,method = RequestMethod.GET)
    public String hello1(@RequestParam String name) throws Exception{
        return "Hello "+name ;
    }

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public User hello2(@RequestHeader String name,@RequestHeader String password) throws Exception{
        return new User(name,password);
    }

    @RequestMapping(value = "hello3",method = RequestMethod.POST)
    public String hello3(@RequestBody String name) throws Exception{
        return name;
    }

}
