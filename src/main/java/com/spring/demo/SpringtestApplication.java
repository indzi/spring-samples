package com.spring.demo;

import com.spring.demo.aop.performance.service.Performance;
import com.spring.demo.aop.performance.serviceimpl.Concert;
import com.spring.demo.aop.performance.serviceimpl.LivePerformance;
import com.spring.demo.aop.soundsystem.aspect.TrackCounter;
import com.spring.demo.aop.soundsystem.serviceimpl.CDPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringtestApplication implements ApplicationRunner {

    @Autowired
    Concert concert;

    @Autowired
    LivePerformance livePerformance;

    @Autowired
    CDPlayer cdPlayer;

    public static void main(String[] args) {
        SpringApplication.run(SpringtestApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        livePerformance.perform();
    }
}

