package com.spring.demo.aop.performance.serviceimpl;

import com.spring.demo.aop.performance.service.Performance;
import org.springframework.stereotype.Component;

@Component
public class LivePerformance implements Performance {
    @Override
    public void perform() {
        System.out.println("Live performance finished");
    }
}
