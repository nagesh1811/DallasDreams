package com.bom.arrays;

public class MountainArray {

    public static void main(String[] args) {
    //int[] arr= {9,8,7,6,5,4,3,2,1,0};
      int[] arr= {3,4,5,2,1};
        System.out.println("====is it Valid Mountain Array::  "+validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr){
        int n = arr.length;
        int i=0;
        // walk up
        while(i+1<n && arr[i]<arr[i+1])
            i++;
        // first or last element should not be high/Max
        if(i==0 || i==arr.length-1)
            return false;
        // walk down
        while(i+1<n && arr[i]>arr[i+1])
            i++;
        return i== n-1;
    }
}
