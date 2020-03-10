package org.yl.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yang
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class FeignApplication {

    public static void main(String [] args) throws Exception{
        SpringApplication app = new SpringApplication(FeignApplication.class);
        app.run(args);
    }
}
