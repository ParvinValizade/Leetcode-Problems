package problems.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        IntStream distinct = Arrays.stream(nums).distinct();
        int length = distinct.toArray().length;
        int thirdMax = length-3;
        if (thirdMax < 0) {
            return Arrays.stream(nums).distinct().toArray()[length-1];
        } else {
            return Arrays.stream(nums).distinct().toArray()[thirdMax];
        }
    }
    public static void main(String[] args) {
        int [] nums = {2,2,3,1,4,5};
        System.out.println(thirdMax(nums));
    }
}
