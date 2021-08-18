package com.bom.arrays;

public class ReplaceElements {

    public static void main(String[] args) {
        int [] arr = {17,18,5,4,6,1};
        replaceElementsWithBigOnes(arr);
        for(int k:arr) {
            System.out.print(", "+k);
        }
    }

    public static int[] replaceElementsWithBigOnes(int[] arr) {
        int length = arr.length;
        int maxSeen = arr[length-1];
        arr[length-1]=-1;
        for(int i=arr.length-2;i>=0;i--) {
        int netmax = Math.max(maxSeen,arr[i]);
            arr[i] = maxSeen;
            maxSeen= netmax;
           }

        return arr;
    }
}
