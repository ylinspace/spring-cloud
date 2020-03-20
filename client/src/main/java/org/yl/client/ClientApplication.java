package org.yl.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
import org.yl.client.component.MyHealthIndicator;

/**
 * @author yang
 */
@EnableEurekaClient
@SpringBootApplication
@ComponentScan("org.yl.client")
@EnableDiscoveryClient
@RibbonClient(name="spring-cloud-server")
@EnableCircuitBreaker
@EnableHystrixDashboard
public class ClientApplication {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String [] args) throws Exception{
        SpringApplication app = new SpringApplication(ClientApplication.class);
        app.run(args);
    }

//    @Bean
//    public MyHealthIndicator myHealthIndicator(){
//        return new MyHealthIndicator();
//    }
}
