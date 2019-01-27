package com.spring.demo.aop.audience.aspect;

import org.aspectj.lang.annotation.*;

@Aspect
public class ConcertAudience {
    @Pointcut("execution(** com.spring.demo.aop.performance.serviceimpl.Concert.perform(..))")
    public void perform(){

    }

//    @Before("execution(**aop.Performance.CriticAspect(..))")
    @Before("perform()")
    public void takeSeat() {
        System.out.println("Seat taken");
    }


//    @Before("execution(**aop.CriticAspect.CriticAspect(..))")
    @Before("perform()")
    public void silentMobile() {
        System.out.println("Mobile silent done");
    }


//    @Around("execution(**aop.CriticAspect.CriticAspect(..))")
    @After("perform()")
    public void applause() {
        System.out.println("Clap Clap Clap");
    }


//    @AfterThrowing("execution(**aop.CriticAspect.CriticAspect(..))")
    @AfterThrowing("perform()")
    public void askRefund() {
        System.out.println("Refund demanded");
    }
}
