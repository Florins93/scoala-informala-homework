package com.sci.bv;

import java.util.Random;

public enum Choices {
    ROCK,PAPER,SCISSORS;
    public static Choices getRandomChoice() {
        Random random = new Random();
        return Choices.values()[random.nextInt(Choices.values().length)];
    }
}
