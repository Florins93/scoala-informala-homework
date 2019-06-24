package com.sci.bv;

public class Model {

    PhoneBook ph = null;

    private Model(){}

    public Model(String file) {
        ph = new PhoneBook(file);
    }

    public PhoneBook getPhoneBook(){
        return ph;
    }


}
