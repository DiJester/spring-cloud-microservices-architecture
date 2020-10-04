package com.liudi.cloud.study.controller;

import com.liudi.cloud.study.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("user/{id}")
    public User findById(@PathVariable Long id){
        /*通过这种写法，一个微服务只能调用固定的另一个微服务，如果加入了新的User微服务实例，这种
        方法就不能调用新增加的微服务
         */
        //return this.restTemplate.getForObject("http://localhost:8001/"+id, User.class);

        return this.restTemplate.getForObject("http://microservice-provider-user/"+id, User.class);

    }
    @GetMapping("/getIpAndPort")
    public String findById() {
        return this.restTemplate.getForObject("http://microservice-provider-user/getIpAndPort", String.class);
    }
}
