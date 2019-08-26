package com.ws.test;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


/**
* @description: 测试
* @author:wangdy
* @create: 2019/8/22 下午8:57
**/
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @LoadBalanced
    @Resource
    RestTemplate restTemplate;
    /**
     * @Description: 获取名称
     * @return:
     * @author:wangdy
     * @Date: 2019/8/22 下午8:58
    */
    @GetMapping("/names")
    public String getNames(){
        String names = restTemplate.getForObject("http://eureka-client-2/eureka2/test/names",String.class);
        return names;
    }


}
