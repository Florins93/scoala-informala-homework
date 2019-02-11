package bv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GameOption1();

    }

    public static void GameOption1()
    {
        TicTac game = new TicTac();
        Scanner scan = new Scanner(System.in);
        int option1 = -1;
        int option2 = -1;

        while(!game.isWin)
        {
            System.out.println(game.getVisualTable());
            System.out.println("Player "+ game.getPlayer() + " turn. Enter coordinates of your move :" );
            System.out.println("row number : "); option1= scan.nextInt();
            System.out.println("column number : "); option2= scan.nextInt();

            if(game.moove(option1,option2)==false){
                System.out.println("Invalid move");
            }
            else
            {
                game.isWin = game.getWinChecker().isWin();

                if(!game.isWin)
                    game.switchPlayer();
            }
        }

        System.out.println(game.getVisualTable());
        System.out.println("player " + game.getPlayer() + " has won. Congratulations !");
    }

    public static void GameOption2()
    {
        TicTac game = new TicTac();
        Scanner scan = new Scanner(System.in);
        int option = -1;

        while(!game.isWin)
        {
            System.out.println(game.getVisualTable());
            System.out.print("Player "+ game.getPlayer() + " turn. Enter one digit(1-9) :" );
            System.out.println("row number : "); option= scan.nextInt();

            option--;

            int option1 = option / 3;
            int option2 = option % 3;

            if(game.moove(option1,option2)==false){
                System.out.println("Invalid move");
            }
            else
            {
                game.isWin = game.getWinChecker().isWin();

                if(!game.isWin)
                    game.switchPlayer();
            }
        }

        System.out.println(game.getVisualTable());
        System.out.println("player " + game.getPlayer() + " has won. Congratulations !");
    }

}
