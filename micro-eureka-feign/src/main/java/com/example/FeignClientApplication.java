

package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@EnableDiscoveryClient
//@AutoConfigurationPackage
//@ComponentScan({ "com.example"})
@SpringBootApplication
public class FeignClientApplication {
    public FeignClientApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(FeignClientApplication.class, args);
    }
}
