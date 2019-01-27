package com.spring.demo.aop.soundsystem.serviceimpl;

import com.spring.demo.aop.soundsystem.service.CompactDisk;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TheBeatles implements CompactDisk {
    private String title = "The Beatles";
    private String artist = "Beatles Band";
    private HashMap<Integer, String> tracks;

    public TheBeatles(HashMap<Integer, String> tracks) {
        this.tracks = addTracks(tracks);
    }

    private HashMap<Integer, String> addTracks(HashMap<Integer, String> tracks) {
        tracks.put(1, "Hey Jude");
        tracks.put(2, "Here comes the sun");
        tracks.put(3, "Come together");

        return tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (Map.Entry<Integer, String> track : tracks.entrySet())
        {
            System.out.println("Currently playing track number " + track.getKey() + " and the name of the track is " + track.getValue());
        }
    }
}
