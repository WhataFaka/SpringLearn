package ru.kityukha.learn;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Sleepwalking");
        songs.add("Viper");
        songs.add("Obey");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
