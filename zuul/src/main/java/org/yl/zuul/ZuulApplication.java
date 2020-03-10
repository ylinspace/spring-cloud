package org.yl.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.yl.zuul.filter.ZuulAccessFilter;

/**
 * @author yang
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApplication {

    public static void main(String [] args) throws Exception{
        SpringApplication app = new SpringApplication(ZuulApplication.class);
        app.run(args);
    }

    @Bean
    public ZuulAccessFilter zuulAccessFilter(){
        return new ZuulAccessFilter();
    }
}
