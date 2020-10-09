package com.yc.springcloud81.miscomsumer.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author liyan
 * @create 2020-10-2020/10/8-16:06
 */
@SpringBootConfiguration
public class RestTemplateConfig {
    @Bean //创建一个 restTemplate 的模板操作对象
    @LoadBalanced   //启用ribbon的客户端负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
