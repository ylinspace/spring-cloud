package org.yl.client.component;

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.health.HealthProperties;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author yang
 */
@Component
public class MyHealthHealthCheckHandler implements HealthCheckHandler {

    @Autowired
    private MyHealthIndicator myHealthIndicator;

    @Override
    public InstanceInfo.InstanceStatus getStatus(InstanceInfo.InstanceStatus instanceStatus) {
        Status status = myHealthIndicator.health().getStatus();
        System.out.println("MyHealthHealthCheckHandler"+ new Date());
        if(status == Status.UP){
            System.out.println("Up!" + new Date());
            return InstanceInfo.InstanceStatus.UP;
        }else{
            System.out.println("Down!" + new Date());
            return InstanceInfo.InstanceStatus.DOWN;
        }
    }
}
