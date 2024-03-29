package problems.arrays;

import java.util.Arrays;

public class MoveZeroes {

    public static int[] moveZeroes(int[] nums) {
        int i = 0;
        for (int num:nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
        return nums;
    }

    public static void main(String[] args) {

       int[] nums = {0,0,1};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
