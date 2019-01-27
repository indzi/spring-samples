package com.spring.demo.aop;

import com.spring.demo.aop.audience.aspect.ConcertAudience;
import com.spring.demo.aop.audience.aspect.EnchoreIntroducer;
import com.spring.demo.aop.audience.aspect.LivePerformanceAudiance;
import com.spring.demo.aop.performance.serviceimpl.CritisismEngineImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AopConfig {

    @Bean
    public ConcertAudience audience() {
        return new ConcertAudience();
    }

    @Bean
    public LivePerformanceAudiance livePerformanceAudiance() {
        return new LivePerformanceAudiance();
    }

    @Bean
    public EnchoreIntroducer enchoreIntroducer() {
        return new EnchoreIntroducer();
    }

    @Bean
    public CritisismEngineImpl critisismEngine(){
        return new CritisismEngineImpl();
    }
}

