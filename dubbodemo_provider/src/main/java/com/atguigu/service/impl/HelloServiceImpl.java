package com.atguigu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

@Service(interfaceClass = HelloService.class)
@Transactional
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        System.out.println("8081");
        return "8081hello " + name;
    }
}
