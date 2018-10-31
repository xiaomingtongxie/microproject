package com.eureka.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xmtx on 2018/11/8.
 */
@RestController
@RequestMapping(value = "/discovery")
public class GetServicesControllor {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/eureka-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }


    @GetMapping(value = "/getServices")
    public List<String> getServices() {
        return this.discoveryClient.getServices();
    }

    @GetMapping(value = "/description")
    public String description() {
        return this.discoveryClient.description();
    }
}
