package bv;

public class TicTac {

    int [][] table;

    Move move;
    Win winChecker;
    boolean isWin;

    public TicTac() {
        move = new Move(this);
        winChecker = new Win(this);
        isWin = false;
        table = new int[3][3];
    }

    public Win getWinChecker() {
        return winChecker;
    }


    public int getPlayer()
    {
        return move.getPlayerNumber();
    }

    public void switchPlayer(){

        if(move.getPlayerNumber()==1){
            move.setPlayerNumber(2);
        }
        else {
            move.setPlayerNumber(1);
        }
    }

    public int[][] getTable()
    {
        return table;
    }

    public int getTableValue(int coordX, int coordY)
    {
        return table[coordX][coordY];
    }

    public String getVisualTable(){
        StringBuilder str = new StringBuilder();
        str.append(getVisualCharacterAtPosition(0,0));
        str.append("|");
        str.append(getVisualCharacterAtPosition(0,1));
        str.append("|");
        str.append(getVisualCharacterAtPosition(0,2));
        str.append("\n");
        str.append("-----");
        str.append("\n");
        str.append(getVisualCharacterAtPosition(1,0));
        str.append("|");
        str.append(getVisualCharacterAtPosition(1,1));
        str.append("|");
        str.append(getVisualCharacterAtPosition(1,2));
        str.append("\n");
        str.append("-----");
        str.append("\n");
        str.append(getVisualCharacterAtPosition(2,0));
        str.append("|");
        str.append(getVisualCharacterAtPosition(2,1));
        str.append("|");
        str.append(getVisualCharacterAtPosition(2,2));

        return str.toString();
    }

    char getVisualCharacterAtPosition(int posX, int posY) {
        return getCharacter(getTableValue(posX, posY));
    }

    char getCharacter(int type)
    {
        char ret = ' ';
        switch(type) {
            case 0:
                ret = ' ';
                break;
            case 1:
                ret = 'x';
                break;
            case 2 :
                ret = '0';
                break;
            default :
                ret = ' ';
                break;
        }
        return ret;
    }

    public boolean moove(int row, int column){
        return move.makeYourMove(row,column);
    }

}
