package ind.bos.atl;



class Target {

    public static void main(String []args){
        int[] input =  {3, 2, 4,1};
        int[] output = twoSum(input,5);
       for(int i = 0;i<output.length;i++) {
           System.out.println(":: "+output[i]);
       }



        int[] input1 =  {3, 2, 4,7,8,32};
        System.out.println(":: input1 array size::  "+ input1.length);

    }
    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        int ctr=0;
        for(int i=1;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]+nums[j]==target) {
                    result[ctr]=i;
                    result[ctr+1]=j;
                }
            }
        }
        return result;
    }
}