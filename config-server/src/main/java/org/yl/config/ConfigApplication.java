package org.yl.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author yang
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {

    public static void main(String [] args) throws Exception{
        SpringApplication app = new SpringApplication();
        app.run(args);
    }
}
