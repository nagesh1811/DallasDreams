package com.bom.arrays;

public class MergeSortedArray {
// merge two integer arrays and arrange them in ascending order.
    public static void main(String[] args) {
        //int[] nums1 = {1,2,3,0,0,0};
        //int[] nums2 = {2,5,6};
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        int  m = 1;
        int  n = 1;
        solution(nums1,m,nums2,n);

    }

    public static void solution(int[] nums1, int m, int[] nums2, int n) {
           // Logic -1
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while (j >= 0) {
            if(i>=0 &&  nums1[i]>nums2[j])
                nums1[k--] = nums1[i--];
             else
                nums1[k--] = nums2[j--];
        }
        for(int s:nums1) {
            System.out.print(", "+s);
        }
        System.out.println();
    }
}
