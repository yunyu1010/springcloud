package com.yao.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yaozhan
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaProviderPayment9003 {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderPayment9003.class, args);
        System.out.println("启动成功");
    }

}
