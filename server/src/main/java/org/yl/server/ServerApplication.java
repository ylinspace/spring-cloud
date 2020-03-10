package org.yl.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author yang
 */
@SpringBootApplication
@EnableEurekaClient
//@ComponentScan("org.yl.server")
@EnableDiscoveryClient
public class ServerApplication {

    public static void main(String [] args) throws Exception{
        SpringApplication app = new SpringApplication(ServerApplication.class);
        app.run(args);
    }
}
