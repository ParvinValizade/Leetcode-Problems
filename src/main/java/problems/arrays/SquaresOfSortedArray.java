package problems.arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        nums[0] = nums[0]*nums[0];
        for (int j = 1; j < n; j++) {
            int key = nums[j]*nums[j];
            int i = j-1;
            while ( (i > -1) && ( nums [i] > key ) ) {
                nums [i+1] = nums [i];
                i--;
            }
            nums[i+1] = key;
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] nums = {8,-1,0,3,-4,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
