package org.yl.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import vo.User;

/**
 * @author yang
 */
@FeignClient("spring-cloud-server")
public interface HelloService {

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    String hello();

    @RequestMapping(value = "/hello1" ,method = RequestMethod.GET)
    public String hello1(@RequestParam String name) ;

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public User hello2(@RequestHeader String name, @RequestHeader String password) ;

    @RequestMapping(value = "hello3",method = RequestMethod.POST)
    public String hello3(@RequestBody User user) ;


}
