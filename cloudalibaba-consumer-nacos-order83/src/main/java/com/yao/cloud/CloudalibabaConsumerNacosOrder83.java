package com.yao.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaConsumerNacosOrder83 {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaConsumerNacosOrder83.class, args);
        System.out.println("启动成功");
    }

}
