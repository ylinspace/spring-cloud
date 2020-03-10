package org.yl.server.component;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthCheck implements HealthIndicator {

    private boolean up = true;

    @Override
    public Health health() {
        return new Health.Builder().up().build();
    }

    public boolean isUp(){
        return up;
    }

    public void setUp(boolean up){
        this.up = up;
    }

}
