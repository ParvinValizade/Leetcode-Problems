package problems.arrays;

import java.util.Arrays;

public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {
        int j = 0;
        int temp;
        for (int i = 0; i< nums.length; i++){
            if (nums[i] % 2 == 0) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] nums = {3,1,2,4,5,8};

        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}
