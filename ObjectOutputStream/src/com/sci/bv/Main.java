package com.sci.bv;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Main {

    public static void main(String[] args) throws IOException {
    String filename="files/fisier.txt";
	Person p1 = new Person("ion","vasile");
	Person p2 = new Person("Gheorghe","gigi");

        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p1);
        oos.writeObject(p2);


    }
}
