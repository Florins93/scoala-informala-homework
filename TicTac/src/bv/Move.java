package bv;

public class Move {

    TicTac game;
    CheckMove checker;
    int playerNumber;

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public Move(TicTac game){
        this.game=game;
        checker = new CheckMove(game);
        setPlayerNumber(1);
    }


   public boolean  makeYourMove(int row, int column){

        if(row<0||row>2){
            return false;
        }

        if(column<0 || column >2){
            return false;
        }

        if(checker.checkMove(row,column) == false) {
            return false;
        }

        game.getTable()[row][column] = playerNumber;



        return true;
    }

}
