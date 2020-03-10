package org.yl.client.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import vo.User;

/**
 * @author yang
 */
@Service
public class ConsumerService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String getData() throws Exception{
        User user = restTemplate.postForEntity("http://spring-cloud-server/user", null,User.class).getBody();

        return user.toString();
    }

    public String fallback(){
        return "Error !!";
    }
}
