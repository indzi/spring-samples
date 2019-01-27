package com.spring.demo.aop.audience.aspect;

import com.spring.demo.aop.performance.service.CritisismEngine;

public aspect CriticAspect {
    private CritisismEngine criticismEngine;



    pointcut perform() : execution(* com.spring.demo.aop.performance.service.Performance.perform(..));

    /*afterReturning() : perform() {

        System.out.println(criticismEngine.getCritisism());
    }*/

    public void setCriticismEngine(CritisismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}
