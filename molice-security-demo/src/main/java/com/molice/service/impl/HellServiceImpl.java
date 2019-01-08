package com.molice.service.impl;

import com.molice.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HellServiceImpl implements HelloService {
    @Override
    public String greeting(String name) {
        System.out.println("greeting");
        return "hello" + name;
    }
}
