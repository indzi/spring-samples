package com.spring.demo.aop.performance.serviceimpl;

import com.spring.demo.aop.performance.service.Enchorable;
import org.springframework.stereotype.Component;

@Component
public class EnchorableImpl implements Enchorable {
    @Override
    public void enchore() {
        System.out.println("Once more, Once more, Once more");
    }
}
