package com.bom.arrays;

public class DuplicateZeros {
// if we found 0 in array we have to duplicate that zero and place it immediatly to next, and also move all elements to
//one step a head.
    public static void main(String[] args) {
        int [] input = {1,0,2,3,0,4,5,0};
        makeDupliateZeros(input);
    }

    public static void makeDupliateZeros(int[] nums) {

        for(int i=0;i<nums.length;i++) {

            if(nums[i]==0) {

                for(int j=nums.length-2;j>=i;j--) {
                   // int ctr = nums.length-1;
                    nums[j+1] = nums[j];

                }
                i++;
            }
        }
        for(int k:nums) {
            System.out.print(", "+k);

        }

    }
}
