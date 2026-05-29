package com.sci.bv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook
{
    private ArrayList<Contact> contactList = null;
    private String file ="";

    private PhoneBook(){

    }

    public PhoneBook(String file){
            contactList = new ArrayList<>();
            this.file=file;
            readAndAddContact();
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void addContactToPhonebook(Contact c)
    {
        contactList.add(c);
    }

    public void readAndAddContact(){

        try {
            List<String> fileLines = Files.readAllLines(Paths.get(file));
            for (String line : fileLines) {
                if(line.length()>3)
                    contactList.add(new Contact(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public void writeContactsToFile(){
        StringBuilder sb = new StringBuilder();
           for(Contact c:contactList){
               sb.append(c.toFileLine());
               sb.append(System.lineSeparator());
           }

            try {
                Files.write(Paths.get(file), "".toString().getBytes(), StandardOpenOption.CREATE);
                Files.write(Paths.get(file),sb.toString().getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }


        }
    }

