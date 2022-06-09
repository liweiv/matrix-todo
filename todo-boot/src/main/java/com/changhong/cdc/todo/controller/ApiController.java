package com.changhong.cdc.todo.controller;

import com.changhong.cdc.todo.config.CustomConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/api/v1/todos")
public class ApiController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;
    //
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;
//    final CustomConfig config;

    public ApiController() {
//        this.config = config;
    }

    @GetMapping("")
    public Object getTodos() {
//        log.info("get todos: config: {}", config);
        String[] todos = {"First", "Second", "Third"};
        return ResponseEntity.ok(todos);
    }

    @GetMapping("/test")
    public String test() {
//        ServiceInstance serviceInstance =    loadBalancerClient.choose("helloworld.http");
//        String url = "http://" + serviceInstance.getServiceId() + ":" + serviceInstance.getPort() + "/member/info/getUserMember/" + username;
        String str = restTemplate.getForObject("http://todo-service-provider/echo/bibi", String.class);
        log.info("todo provider: {}", str);
        return restTemplate.getForObject("http://helloworld.http/helloworld/cde", String.class);
    }


    @GetMapping("/services")
    public Object services() {
        return discoveryClient.getServices();
    }
}
