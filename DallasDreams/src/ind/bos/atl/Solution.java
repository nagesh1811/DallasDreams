package ind.bos.atl;

public class Solution {

    public static void main(String args[]) {
        int[] nums = {1,1,0,1,1,0,1,1,1};
        System.out.println("findMaxConsecutives(nums):: RESULT:: "+findMaxConsecutives(nums));
    }
    public static int findMaxConsecutives(int[] nums) {
        int counter = 0;
        int result=0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] == 1) {
                counter++;
            } else {
                if (counter > result) {
                    result = counter;
                }

                if (result >= nums.length / 2) {
                    return result;
                }
                counter = 0;
            }
        }
         return Math.max(result,counter);

    }
}
