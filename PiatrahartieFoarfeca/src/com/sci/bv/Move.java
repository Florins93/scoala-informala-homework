package com.sci.bv;

public class Move {
    public int playerNumber;

    public Move() {
        setPlayerNumber(1);
    }

    public int getPlayerNumber() {
        return playerNumber;
    }
    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }



    public void switchPlayer(){

        if(getPlayerNumber()==1){
            setPlayerNumber(2);
        }
        else {
            setPlayerNumber(1);
        }
    }
}
