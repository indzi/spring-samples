package com.spring.demo.aop.soundsystem.serviceimpl;

import com.spring.demo.aop.soundsystem.service.CompactDisk;

import java.util.List;
import java.util.Map;

public class BlankDisk implements CompactDisk {

    private String title;
    private String artist;
    private Map<Integer, String> tracks;

    public BlankDisk(String title, String artist, Map<Integer, String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (Map.Entry<Integer, String> track : tracks.entrySet())
        {
            System.out.println("Currently playing track number " + track.getKey() + " and the name of the track is " + track.getValue());
        }
    }

}
