package com.bom.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListPractise {


    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        List<String> secondList = new ArrayList<>();
        nameList.add("Laxmi");
        nameList.add("selina");
        nameList.add("Jaya");
        nameList.add("Rama");
        nameList.add("Kalpana Chawla");

        secondList.add("Prem");
        secondList.add("sarkar");
        secondList.add("pramod");
        secondList.add("Rama");
        secondList.add("Laxmi");
        secondList.add("selina");

        System.out.println("2nd Position Element :"+fetchSpecificIndexElement(nameList,2));
        System.out.println("^^^^^^^^^^ BEFORE  Swap Elements ===");
        nameList.forEach(System.out ::println);
        updateList(nameList,"Jaya","Mahima");
        System.out.println("$$$$$$$$$$ After Swap Elements ===");
        nameList.forEach(System.out ::println);
        System.out.println("==== COMPARE LISTS RESULTS =====");
        compareLists(nameList,secondList).forEach(System.out::println);
    }

    //Write a Java program to retrieve an element (at a specified index) from a given array list.
    public static String fetchSpecificIndexElement(List<String> nameList, int index) {
        return nameList.get(index-1);
    }

    //Write a Java program to update specific array element by given element.
    public static List<String> updateList(List<String> nameList, String source, String target) {
        for(int i=0;i<nameList.size();i++) {
            if(nameList.get(i).equals(source)) {
                nameList.remove(source);
                nameList.add(i,target);
            }
        }
        Collections.swap(nameList,1,4);
     return nameList;
    }
        // compare two lists

        public static List<String> compareLists(List<String> firsList, List<String> secondList) {
        List<String> resultList = new ArrayList<>();
        for(String str:firsList) {
            resultList.add(secondList.contains(str)?"":str);
        }
        return resultList;
    }

}
