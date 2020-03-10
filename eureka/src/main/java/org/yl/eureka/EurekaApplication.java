package org.yl.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author yang
 */
@EnableEurekaServer
@SpringBootApplication
@ComponentScan("org.yl.eureka")
public class EurekaApplication {

    public static void main(String [] args) throws Exception{
        SpringApplication app = new SpringApplication(EurekaApplication.class);
        app.run(args);
    }

}
