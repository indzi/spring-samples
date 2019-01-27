package com.spring.demo.aop.soundsystem.serviceimpl;

import com.spring.demo.aop.soundsystem.service.CompactDisk;
import com.spring.demo.aop.soundsystem.service.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisk cd;

    @Autowired
    public void setCd(CompactDisk cd) {
        this.cd = cd;
    }
    public void play() {
        cd.play();
    }
}
