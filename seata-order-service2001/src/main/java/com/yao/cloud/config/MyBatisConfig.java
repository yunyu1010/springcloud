package com.yao.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.yao.cloud.dao"})
public class MyBatisConfig {
}
