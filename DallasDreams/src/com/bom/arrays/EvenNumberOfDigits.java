package com.bom.arrays;

public class EvenNumberOfDigits {

    public static void main(String[] args) {
        int[] input = {6,78,456,2345,8754,23,456,231,12};

        System.out.println("number of Digits in :: "+findEvenNumberOfDigits(input));

    }

    public static int findEvenNumberOfDigits(int[] nums) {
        int evenDigitscounter=0;
        for(int i=0;i< nums.length;i++){
            int ctr=0;
            while(nums[i]!=0){
                nums[i]=nums[i]/10;
                ctr++;
            }
            if(ctr%2==0){
                evenDigitscounter++;
            }
        }
    return evenDigitscounter;
    }
}
