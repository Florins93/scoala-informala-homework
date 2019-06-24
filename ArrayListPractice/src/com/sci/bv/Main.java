package com.sci.bv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {

// Creae a list and add some colors to the list
//        List<String> list_Strings = new ArrayList<String>();
//        list_Strings.add("Red");
//        list_Strings.add("Green");
//        list_Strings.add("Orange");
//        list_Strings.add("White");
//        list_Strings.add("Black");
//Print the list
//        System.out.println(list_Strings);
// Update the third element with "Yellow"
//        list_Strings.set(2, "Yellow");
// Print the list again
//        System.out.println(list_Strings);


//  Create a list and add some colors to the list
//        List<String> list_Strings = new ArrayList<String>();
//        list_Strings.add("Red");
//        list_Strings.add("Green");
//        list_Strings.add("Orange");
//        list_Strings.add("White");
//        list_Strings.add("Black");
// Search the value Red
//        for(int i=0;i<list_Strings.size();i++){
//            if (list_Strings.contains("Red")) {
//                System.out.println("The position is "+i);
//            System.out.println("Found the element");
//            break;
//        } else {
//            System.out.println("There is no such element");
//
//        }
//        }



//  Sorted
//        List<String> list_Strings = new ArrayList<String>();
//        list_Strings.add("Red");
//        list_Strings.add("Green");
//        list_Strings.add("Orange");
//        list_Strings.add("White");
//        list_Strings.add("Black");
//        System.out.println("List before sort: "+list_Strings);
//        Collections.sort(list_Strings);
//        System.out.println("List after sort: "+list_Strings);


//copy one array list into another
//        List<String> List1 = new ArrayList<String>();
//        List1.add("1");
//        List1.add("2");
//        List1.add("3");
//        List1.add("4");
//        System.out.println("List1: " + List1);
//        List<String> List2 = new ArrayList<String>();
//        List2.add("A");
//        List2.add("B");
//        List2.add("C");
//        List2.add("D");
//        System.out.println("List2: " + List2);
//        // Copy List2 to List1
//        Collections.copy(List1, List2);
//        System.out.println("Copy List to List2,\nAfter copy:");
//        System.out.println("List1: " + List1);
//        System.out.println("List2: " + List2);




// Reverse elements from a list
//        List<String> list_Strings = new ArrayList<String>();
//        list_Strings.add("Red");
//        list_Strings.add("Green");
//        list_Strings.add("Orange");
//        list_Strings.add("White");
//        list_Strings.add("Black");
//        System.out.println("List before reversing :\n" + list_Strings);
//        Collections.reverse(list_Strings);
//        System.out.println("List after reversing :\n" + list_Strings);



// Create a new list to extract a portion of a array list
//        List<String> list_Strings = new ArrayList<String>();
//        list_Strings.add("Red");
//        list_Strings.add("Green");
//        list_Strings.add("Orange");
//        list_Strings.add("White");
//        list_Strings.add("Black");
//        System.out.println("Original list: " + list_Strings);
//        List<String> sub_List = list_Strings.subList(0, 3);
//        System.out.println("List of first three elements: " + sub_List);





//Compare 2 arrayLists
//        ArrayList<String> c1= new ArrayList<String>();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//
//        ArrayList<String> c2= new ArrayList<String>();
//        c2.add("Red");
//        c2.add("Green");
//        c2.add("Black");
//        c2.add("Pink");
//
//Storing the comparison output in ArrayList<String>
//        ArrayList<String> c3 = new ArrayList<String>();
//        for (String e : c1)
//            c3.add(c2.contains(e) ? "Yes" : "No");
//        System.out.println(c3);

//        ArrayList<String> c1= new ArrayList<String>();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//
//        ArrayList<String> c2= new ArrayList<String>();
//        c2.add("Red");
//        c2.add("Green");
//        c2.add("Black");
//        c2.add("Pink");
//
//        //Storing the comparison output in ArrayList<String>
//        ArrayList<String> c3 = new ArrayList<String>();
//        for (String e : c1)
//            if(c2.contains(e)){
//                c3.add("YES");
//            }
//            else{
//                c3.add("NO");
//            }
//        System.out.println(c3);





//Exchange positions between 2 elements
//        ArrayList<String> c1= new ArrayList<String>();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//
//        System.out.println("Array list before Swap:");
//        for(String a: c1){
//            System.out.println(a);
//        }
//        //Swapping 1st(index 0) element with the 3rd(index 2) element
//        Collections.swap(c1, 0, 2);
//        System.out.println("Array list after swap:");
//        for(String b: c1){
//            System.out.println(b);


//concatenate 2 strings
//        ArrayList<String> c1= new ArrayList<String>();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//        System.out.println("List of first array: " + c1);
//        ArrayList<String> c2= new ArrayList<String>();
//        c2.add("Red");
//        c2.add("Green");
//        c2.add("Black");
//        c2.add("Pink");
//        System.out.println("List of second array: " + c2);
// Let join above two list
//        ArrayList<String> a = new ArrayList<String>();
//        a.addAll(c1);
//        a.addAll(c2);
//        System.out.println("New array: " + a);





//add capacity and elements to a list
//        ArrayList<String> c1= new ArrayList<String>(3);
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        System.out.println("Original array list: " + c1);
// Increase capacity to 6
//        c1.ensureCapacity(6);
//        c1.add("White");
//        c1.add("Pink");
//        c1.add("Yellow");
//        System.out.println("New array list: " + c1);






//retain the same elements
//        HashSet<String> h_set1 = new HashSet<String>();
// use add() method to add values in the hash set
//        h_set1.add("Red");
//        h_set1.add("Green");
//        h_set1.add("Black");
//        h_set1.add("White");
//        System.out.println("Frist HashSet content: "+h_set1);
//        HashSet<String>h_set2 = new HashSet<String>();
//        h_set2.add("Red");
//        h_set2.add("Pink");
//        h_set2.add("Black");
//        h_set2.add("Orange");
//        System.out.println("Second HashSet content: "+h_set2);
//        h_set1.retainAll(h_set2);
//        System.out.println("HashSet content:");
//        System.out.println(h_set1);

    }
}
