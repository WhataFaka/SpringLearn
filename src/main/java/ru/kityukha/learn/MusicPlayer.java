package ru.kityukha.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    @Autowired
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }


    public MusicPlayer() {
    }

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
