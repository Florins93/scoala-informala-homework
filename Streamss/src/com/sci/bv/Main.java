package com.sci.bv;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
//
//    public static void main(String[] args) {
//	List<String> myList = Arrays.asList("a1","a2","b1","c1","c2");
//
//	myList
//            .stream()
//            .filter(s->s.startsWith("c"))
//            .map(String::toUpperCase)
//            .sorted()
//            .forEach(System.out::println);






//        Stream.of("d2", "a2", "b1","a3","b3", "c")
//                .map(s -> {
//                    System.out.println("map: " + s);
//                    return s.toUpperCase();
//                })
//                .anyMatch(s -> {
//                    System.out.println("anyMatch :" + s);
//                    return s.startsWith("A");
//                });





//        Arrays.asList("a1","a2","b1","c2","c1")
//                .parallelStream()
//                .filter(s->{
//                    System.out.format("filter: %s [%s]\n",s, Thread.currentThread().getName());
//                    return true;
//                })
//                .map(s->{
//                    System.out.format("filter: %s [%s]\n",s, Thread.currentThread().getName());
//                    return s.toUpperCase();
//                })
//                .forEach(s->System.out.format("filter: %s [%s]\n",s, Thread.currentThread().getName()));




//         Arrays.asList("capac","pompier","pix","asdfdsa","cal")
//               .stream()
//               .filter(s->{
//                           String rev = new StringBuilder(s).reverse().toString();
//                           return s.equals(rev);
//
//                       })
//               .forEach(System.out::println);



//        IntStream.range(1,101)
//                .mapToObj(i->i)
//                .filter(s->{
//
//                })
//                .forEach(System.out::println);











//
//    }
//    public static boolean istPalindrom(char[] word){
//        int i1 = 0;
//        int i2 = word.length - 1;
//        while (i2 > i1) {
//            if (word[i1] != word[i2]) {
//                return false;
//            }
//            ++i1;
//            --i2;
//        }
//        return true;
//    }

}

