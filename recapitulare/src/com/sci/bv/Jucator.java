package com.sci.bv;

public class Jucator {
    int appearances;
    int goals;
    String nume;
    float mvpScore;


    public Jucator(String nume, int appearances, int goals ) {
        this.appearances = appearances;
        this.goals = goals;
        this.nume = nume;
        mvpScore=(float)goals/(float)appearances;
    }

    public String toString()
    {
        return nume+" "+appearances + " " +goals;
    }

    public float getMvpIndex(){
        return mvpScore;
    }

}
