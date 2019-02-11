package bv;

public class Win {

    private TicTac game;

    private Win() {

    }
    public Win(TicTac reference) {
        game = reference;
    }

    boolean sameValueNotZero(int v1, int v2, int v3)
    {
        if((v1 == 0)||(v2 == 0)||(v3 == 0)){
            return false;
        }

        boolean ret = false;

        if( (v1 == v2) && (v2 == v3) )
        {
            ret = true;
        }
        return ret;
    }

    public boolean isWin()
    {
        boolean win = false;

        if(sameValueNotZero(game.table[0][0], game.table[0][1], game.table[0][2])){
            win = true;
        }
        else
        if(sameValueNotZero(game.table[1][0], game.table[1][1], game.table[1][2])) {
            win = true;
        }
        else
        if(sameValueNotZero(game.table[2][0], game.table[2][1], game.table[2][2])) {
            win = true;
        }
        else if(sameValueNotZero(game.table[0][0], game.table[1][0], game.table[2][0])) {
            win = true;
        }
         else if(sameValueNotZero(game.table[0][1], game.table[1][1], game.table[2][1])) {
        win = true;
        }
        else if(sameValueNotZero(game.table[0][2], game.table[1][2], game.table[2][2])) {
            win = true;
        }
        else if(sameValueNotZero(game.table[0][0], game.table[1][1], game.table[2][2])) {
            win = true;
        }
        else if(sameValueNotZero(game.table[0][2], game.table[1][1], game.table[2][0])) {
        win = true;
        }

        return win;
    }
}
