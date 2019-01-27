package com.spring.demo.aop.audience.aspect;

import com.spring.demo.aop.performance.service.Enchorable;
import com.spring.demo.aop.performance.serviceimpl.EnchorableImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EnchoreIntroducer {

    @DeclareParents(value = "com.spring.demo.aop.performance.serviceimpl.LivePerformance",
    defaultImpl = EnchorableImpl.class)
    public static Enchorable enchorable;
}
