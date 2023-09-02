package problems.arrays;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i<nums.length;i++) {
            int pow = (int) Math.pow(nums[i], 2);
            nums[i] = pow;
        }

        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
