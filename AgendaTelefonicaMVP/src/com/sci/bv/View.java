package com.sci.bv;

import java.util.Scanner;

public class View {

    Presenter pr =null;

    private View(){}

    public View(Presenter p){
        ShowHelp();
        pr = p;
    }

    public void showMenu(){
        Scanner s = new Scanner(System.in);
        int option = s.nextInt();

        while(option!=4){

            ShowHelp();

            switch(option){

                case 1:
                    pr.addContact();
                    break;
                case 2:
                    pr.removeContact();
                    break;
                case 3:
                    pr.showContactList();
                    break;
                case 4:
                    pr.closeResources();
                    break;

                default:
                    System.out.println("Please select an existing option ");
            }
            option=s.nextInt();

        }

        s.close();
    }

    public static void ShowHelp()
    {
        System.out.println("1. Adauga contact");
        System.out.println("2. Sterge contact");
        System.out.println("3. Afisare lista contacte");
        System.out.println("4. Exit");
        System.out.println(" ");
        System.out.println("Raspuns : ");

    }





}
