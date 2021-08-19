package com.bom.arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] input = {-4, -1, 0, 3, 10};

        int[] output = FetchSquaresOfSortedArray(input);
        for(int k:output) {
            System.out.print(", "+k);

        }
    }

    public static int[] FetchSquaresOfSortedArray(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int pointer = nums.length-1;
        int [] result = new int[nums.length];

        while(left<=right) {
            if(Math.abs(nums[left])< Math.abs(nums[right])){
                result[pointer] = nums[right]*nums[right];
                pointer--;
                right--;
            } else {
                result[pointer] = nums[left]*nums[left];
                pointer--;
                left++;
            }
        }

        return result;
    }
}