package com.sci.bv;

import java.util.Scanner;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Jucator> players = new ArrayList<>();
        //        try(BufferedReader br = new BufferedReader(new FileReader("goals.txt"))) {
//            StringBuilder sb = new StringBuilder();
//            String line = br.readLine();
//
//            while (line != null) {
//                sb.append(line);
//                sb.append(System.lineSeparator());
//                line = br.readLine();
//            }
//            String everything = sb.toString();
//            System.out.println(everything);
//        } catch(Exception e){
//            System.out.println("");
//        }
        try {
            FileReader file = new FileReader("goals.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String linie1 = scan.nextLine();
                String linie2 = scan.nextLine();
                String linie3 = scan.nextLine();

                players.add(new Jucator(
                        linie1,
                        Integer.parseInt(linie2),
                        Integer.parseInt(linie3)
                        ));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (Jucator jucator:players
             ) {
            System.out.println(jucator.toString());

        }

        System.out.println("Most Used Player");
        System.out.println(mostUsedPlayer(players));
        System.out.println("Highest Goal Scorer");
        System.out.println(highestGoalScorer(players));
        System.out.println("MVP");
        System.out.println( mvp( players));
    }
    public static Jucator mostUsedPlayer(ArrayList<Jucator> players)
    {int max=0;
        for(int i=1;i<players.size();i++){
            if(players.get(max).appearances <players.get(i).appearances)
                max=i;
        }

        return players.get(max);
    }



    public static Jucator highestGoalScorer(ArrayList<Jucator> players)
    {   int highScorer=0;
        for(int i=1;i<players.size();i++){
            if(players.get(highScorer).goals <players.get(i).goals)
                highScorer=i;
        }
        return players.get(highScorer);
    }



    public static Jucator mvp(ArrayList<Jucator> players)
    { int mvpIndex=0;
        for(int i=1;i<players.size();i++){

            if(players.get(mvpIndex).getMvpIndex()<players.get(i).getMvpIndex()){
                mvpIndex=i;
            }
        }
        return players.get(mvpIndex);
    }
}




