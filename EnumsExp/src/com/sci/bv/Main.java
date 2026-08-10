package com.sci.bv;

public class Main {

    public enum Color{
        RED(1),
        BLUE(5),
        GREEN(7);

        private final int value;

        private Color(int value){
            this.value=value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Color c = Color.RED;

        if(c.getValue() == Color.GREEN.getValue())
            System.out.println("E verde");
        else
            System.out.println("NU e verde !");



    }
}
