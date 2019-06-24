package com.sci.bv;

import java.util.Scanner;

public class Presenter {

    Model md=null;

    private Presenter(){}

    public Presenter(Model m){
        md=m;
    }



    public void addContact(){
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

        md.getPhoneBook().addContactToPhonebook(new Contact(nume, prenume, tel1, tel2, email));
    }

    public void removeContact(){
        showContactList();

        System.out.println("Sterge contactul de la indexul:");
        Scanner scan = new Scanner(System.in);
        int opt = scan.nextInt();

        //indexul din lista e cu 1 mai mic
        opt--;

        md.getPhoneBook().getContactList().remove(opt);

        System.out.println("Succes");

    }

    public void showContactList(){

        Integer index = 0;
        for(Contact c : md.getPhoneBook().getContactList())
        {
            System.out.println((++index).toString() + ". " + c.toString());
        }
    }

    public void closeResources(){
        md.getPhoneBook().writeContactsToFile();
    }

}
