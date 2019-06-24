package com.sci.bv;





public class Main {

    public static void main(String[] args) {
        for (Season season: Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }


        Month month = Month.JANUARY;
        switch (month) {
            case JANUARY :
                System.out.println("Month "+ month +" belong to "+Season.WINTER+" season");
                break;
            case FEBRUARY:
                System.out.println("Month "+ month +" belong to "+Season.WINTER+" season");
                break;
            case MARCH:
                System.out.println("Month "+ month +" belong to "+Season.SPRING+" season");
                break;
            case APRIL:
                System.out.println("Month "+ month +" belong to "+Season.SPRING+" season");
                break;
            case MAY:
                System.out.println("Month "+ month +" belong to "+Season.SPRING+" season");
                break;
            case JUNE:
                System.out.println("Month "+ month +" belong to "+Season.SUMMER+" season");
                break;
            case JULY:
                System.out.println("Month "+ month +" belong to "+Season.SUMMER+" season");
                break;
            case AUGUST:
                System.out.println("Month "+ month +" belong to "+Season.SUMMER+" season");
                break;
            case SEPTEMBER:
                System.out.println("Month "+ month +" belong to "+Season.AUTUMN+" season");
                break;
            case OCTOBER:
                System.out.println("Month "+ month +" belong to "+Season.AUTUMN+" season");
                break;
            case NOVEMBER:
                System.out.println("Month "+ month +" belong to "+Season.AUTUMN+" season");
                break;
            case DECEMBER:
                System.out.println("Month "+ month +" belong to "+ Season.WINTER+" season");
                break;
            default:
                System.out.println("Invalid month");
        }


    }
}
