package org.wang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableFeignClients
public class OrderMainFeign80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainFeign80.class, args);
    }
}
