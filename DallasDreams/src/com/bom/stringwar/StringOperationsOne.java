package com.bom.stringwar;

public class StringOperationsOne {
//Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.
//A substring is a contiguous sequence of characters within a string.

    public static void main(String[] args) {
        String word = "aaaaabbbbb";
        String[] input = {"a","b","c"};
        System.out.println("Result is ===> "+solution(input,word));
    }

    public static int solution(String[] pattern, String word ){
         int ctr=0;
        for(String str:pattern) {

            if(str.equals(word) || word.contains(str)) {
              ctr++;
            }
        }
        return ctr;
    }
}
