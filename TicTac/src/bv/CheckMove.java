package bv;

public class CheckMove {

    private TicTac game;

    public CheckMove(TicTac game) {
        this.game = game;
    }

    public boolean checkMove(int linie, int coloana){
        if(game.getTableValue(linie,coloana) !=0)
        {
            return false;
        }

        return true;
    }
}
