package com.github.al3dekev.guesswhatitis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuesswhatitisApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuesswhatitisApplication.class, args);

        initializer TheGame = new initializer("Guess What It Is");

    }
}
