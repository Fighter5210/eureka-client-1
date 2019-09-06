package com.ws.test;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @program: eureka-client-1
 * @description:
 * @author: zxb
 * @create: 2019-08-27 12:21
 **/
@FeignClient("eureka-client-2")
public interface TestService {
    @RequestMapping(value = "/eureka2/test/randoms", method = RequestMethod.GET)
    String getRandom();
}
