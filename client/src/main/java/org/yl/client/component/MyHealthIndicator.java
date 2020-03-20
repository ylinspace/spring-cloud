package org.yl.client.component;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author yang
 */
@Component
public class MyHealthIndicator implements HealthIndicator {

    private boolean runStatus = true;

    @Override
    public Health health() {
        System.out.println("health check!" + new Date());
        if(check()){
            System.out.println("up!");
            return Health.up().build();
        }else{
            System.out.println("down!");
            return Health.down().withDetail("Error code","500").build();
        }
    }

    private boolean check(){
        return runStatus;
    }

    public void setRunStatus(boolean status){
        this.runStatus = status;
    }
}
