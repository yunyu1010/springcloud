package com.yao.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaConfigNacosClient3377 {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaConfigNacosClient3377.class, args);
        System.out.println("启动成功");
    }

}
