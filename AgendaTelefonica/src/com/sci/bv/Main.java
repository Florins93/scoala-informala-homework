package com.sci.bv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PhoneBook p = new PhoneBook("PBData.FILE");

        ShowHelp();

        Scanner s = new Scanner(System.in);
        int option = s.nextInt();

        while(option!=4){

            ShowHelp();

            switch(option){

                case 1:
                    addContact(p);
                    break;
                case 2:
                    removeContact(p);
                    break;
                case 3:
                    showContactList(p);
                    break;
                case 4:
                    break;

                default:
                    System.out.println("Please select an existing option ");
            }
            option=s.nextInt();

        }

        s.close();
        p.writeContactsToFile();
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

    public static void addContact(PhoneBook p){
        String nume,prenume,tel1,tel2,email;

        Scanner scan = new Scanner(System.in);



        System.out.println("nume: ");
        nume = scan.nextLine();

        System.out.println("prenume: ");
        prenume = scan.nextLine();

        System.out.println("tel1: ");
        tel1 = scan.nextLine();

        System.out.println("tel2: ");
        tel2 = scan.nextLine();

        System.out.println("email: ");
        email = scan.nextLine();

        p.addContactToPhonebook(new Contact(nume, prenume, tel1, tel2, email));
    }

    public static void removeContact(PhoneBook p){
        showContactList(p);

        System.out.println("Sterge contactul de la indexul:");
        Scanner scan = new Scanner(System.in);
        int opt = scan.nextInt();

        //indexul din lista e cu 1 mai mic
        opt--;

        p.getContactList().remove(opt);

        System.out.println("Succes");

    }

    public static void showContactList(PhoneBook p){

        Integer index = 0;
        for(Contact c : p.getContactList())
        {
            System.out.println((++index).toString() + ". " + c.toString());
        }
    }
}
