package com.yao.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yaozhan
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaProviderPayment9002 {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderPayment9002.class, args);
        System.out.println("启动成功");
    }

}
