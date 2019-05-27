package com.sci.bv;



public class Load implements Comparable<Load>{
    String fName;
    String lName;
    String birthday;
    String month;





    //return the number of month and cut the '0' if month is lower than 10
    public String getMonth() {
        int position = -1;
        for(int i=0;i<month.length();i++){
            if(month.charAt(i)!='0'){
                position=i;
                break;
            }
        }
        if(position==-1){
            return"";
        }else{
            System.out.println(month.substring(position)+"*");
            return month.substring(position);
        }

    }


    //find the month
    public Load(String line){
        String [] split=line.split(",|-");
        lName = split[0];
        fName = split[1];
        birthday = split[2];
        month=split[3];
    }


    // return first name, last name and the month of a person's birth
    public String toString()
    {
        return fName+" "+lName+ " " +month;
    }


    // return only first name and last name of a person
    public String fileContent()
    {
        return fName+" "+lName+ "\n";
    }

    public int compareTo(Load l) {
        String l1= this.fName + this.lName;
        String l2 = l.fName + l.lName;
        return l1.compareTo(l2);
    }
}