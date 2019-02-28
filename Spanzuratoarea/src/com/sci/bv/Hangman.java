package com.sci.bv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Hangman {
    String txtFile = "file/words.txt";
    ArrayList<String> words = new ArrayList<>();
    String line = "";

                try (
    BufferedReader br = new BufferedReader(new FileReader(txtFile))){
        while (((line = br.readLine()) != null)) {
            if (line.length() > 4) {
                words.add(line);
            }
        }


    }
                catch (
    IOException e) {
        e.printStackTrace();
    }




    public  String getRandomString(){
        Random rand = new Random();
        String randomWord = words.get(rand.nextInt(words.size()));
        return randomWord;
    }
}
