package org.yl.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yl.server.component.HealthCheck;

@RestController
public class HealthTestController {

    @Autowired
    HealthCheck healthCheck;

    @GetMapping("/up" )
    public String up(@RequestParam("up") Boolean up) {
        healthCheck.setUp(false);
        return up.toString();
    }

}
