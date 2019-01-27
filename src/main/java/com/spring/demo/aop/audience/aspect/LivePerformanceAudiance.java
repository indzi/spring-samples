package com.spring.demo.aop.audience.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LivePerformanceAudiance {

    @Pointcut("execution(** com.spring.demo.aop.performance.serviceimpl.LivePerformance.perform(..))")
    public void perform(){

    }

    @Around("perform()")
    public void enjoyLivePerformance(ProceedingJoinPoint proceedingJoinPoint) {
       try {
           System.out.println("Mass of visitors gathered");
           System.out.println("Applause for the performer");
           System.out.println("Starts dancing");
           proceedingJoinPoint.proceed();
           System.out.println("Applause and claps");
           System.out.println("Crowd left");
       } catch (Throwable throwable) {
           System.out.println("Crowd gives booooooooo");
       }

    }


}
