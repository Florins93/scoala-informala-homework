package com.sci.bv;

public class Contact {

    private String name=null;
    private String surName=null;
    private String phone1=null;
    private String phone2=null;
    private String mail=null;

    private String contactFileLine=null;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }





    public Contact(String contactFileLine){
        this.name="";
        this.surName="";
        this.phone1="";
        this.phone2="";
        this.mail="";
        this.contactFileLine = contactFileLine;
        splittingLine();
    }

    public Contact(String name, String surName, String phone1, String phone2, String mail) {
        this.name = name;
        this.surName = surName;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.mail = mail;
        this.contactFileLine="";

    }

    private Contact(){

    }

    private void splittingLine(){
        String [] split=contactFileLine.split(";");
        name = split[0];
        surName = split[1];
        phone1 = split[2];
        phone2 =split[3];
        mail = split[4];

    }

    public String toString(){
        return name+" "+surName+" "+phone1+" "+phone2+" "+mail;
    }

    public String toFileLine(){
        return name+";"+surName+";"+phone1+";"+phone2+";"+mail;
    }
}
