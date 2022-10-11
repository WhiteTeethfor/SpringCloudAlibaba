package org.wang.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author Wang
 * @date 2022/10/11 14:57
 */
@Component
public class GateWayConfig {
    /**
     * 通过配置Bean来代替application.yml的配置
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_xw",
                r->r.path("/bilibii")
                        .uri("https://www.bilibili.com")).build();
        return  routes.build();
    }

}
