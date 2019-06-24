package com.sci.bv;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            System.out.println(Choices.getRandomChoice());
        }


        String firstChoice = Choices.getRandomChoice().toString();
        String secondChoice = Choices.getRandomChoice().toString();
        System.out.println(firstChoice +" "+secondChoice);

        List<Choices> list = Arrays.asList(Choices.values());

        System.out.println(list);





    }


}
