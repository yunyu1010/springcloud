package com.yao.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yaozhan
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaSentinelService8401 {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaSentinelService8401.class, args);
        System.out.println("启动成功");
    }

}
