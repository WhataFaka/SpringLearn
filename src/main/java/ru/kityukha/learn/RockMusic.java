package ru.kityukha.learn;

import org.springframework.stereotype.Component;
@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
