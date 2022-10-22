package ru.kityukha.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        ClassicalMusic classicalMusic = context.getBean("musicClassical", ClassicalMusic.class);

//        System.out.println(classicalMusic.getSong());
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

        context.close();
    }
}
