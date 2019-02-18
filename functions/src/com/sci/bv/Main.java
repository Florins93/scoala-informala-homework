package com.sci.bv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int primulNumar = scan.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        int alDoileaNumar = scan.nextInt();

        maxi m1 = new maxi();

        System.out.println("Maximul dintre primele 2 numere este: ");
        System.out.println(m1.getMax(primulNumar,alDoileaNumar));

        System.out.println("Introduceti primul numar: ");
        primulNumar = scan.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        alDoileaNumar = scan.nextInt();
        System.out.println("Introduceti al treliea numar");
        int alTreileaNumar = scan.nextInt();


        System.out.println("Maximul dintre cele 3  numere este: ");
        System.out.println(m1.getMax2(primulNumar,alDoileaNumar,alTreileaNumar));

        Degrees a1= new Degrees();
        System.out.println("Insert your body temperature, measured in Fahrenheit degrees ");
        float c =scan.nextFloat();
        float a= a1.toCelsius(c);
        System.out.println("Your body temperature in Celsius degrees is " + a);
        if(a>=37){
            System.out.println("You are ill!");
        }

        Time t1=new Time();
        System.out.println("Insert hour ");
        primulNumar = scan.nextInt();
        System.out.println("Insert minute ");
        alDoileaNumar = scan.nextInt();

        System.out.println(t1.hourAndMinutes(primulNumar,alDoileaNumar));

    }
}
