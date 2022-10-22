package ru.kityukha.learn;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {


    @Override
    public String getSong() {
        return "Old man";
    }
}
