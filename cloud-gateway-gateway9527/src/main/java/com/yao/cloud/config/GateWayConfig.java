package com.yao.cloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yaozhan
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_atguigu", r -> r.path("/guoji").uri("http://news.baidu.com/guonei"))
                .build();


        routes.route("payment_routh", r -> r.path("/payment/lb/**").uri("lb://cloud-payment-service"))
                .build();
        routes.route("payment_routh2", r -> r.path("/payment/lb/**").uri("lb://cloud-payment-service"))
                .build();


        return routes.build();
    }
}