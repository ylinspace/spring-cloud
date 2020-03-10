package org.yl.client.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import org.yl.client.service.ConsumerService;
import vo.User;

/**
 * @author yang
 */
@RestController
public class ConsumerController {

    @Autowired
    private DiscoveryClient discoveryCLient;

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloConsumer(){
//        List<ServiceInstance> instances = this.discoveryCLient.getInstances("spring-cloud-server");
//        if(instances != null && instances.size()>0){
//            System.out.println(instances.get(0).getUri());
//        }


//        return restTemplate.getForEntity("http://spring-cloud-server/hello",String.class).getBody();
        return "Hello Client!";
    }

    @GetMapping("/user")
    public String user() throws Exception {

        return consumerService.getData();
    }

}

