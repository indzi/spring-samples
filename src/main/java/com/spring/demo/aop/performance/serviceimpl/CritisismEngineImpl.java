package com.spring.demo.aop.performance.serviceimpl;

import com.spring.demo.aop.performance.service.CritisismEngine;
import org.springframework.stereotype.Component;

@Component
public class CritisismEngineImpl implements CritisismEngine {
    private String[] criticismPool;

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }

    @Override
    public String getCritisism() {
        int i = (int) (Math.random() * criticismPool.length);
        return criticismPool[i];
    }
}
