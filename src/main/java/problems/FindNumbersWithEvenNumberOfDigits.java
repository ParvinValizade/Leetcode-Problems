package problems;

public class FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        int evenNumberCount = 0;
        for (int i = 0; i<nums.length;i++) {
            while (nums[i] != 0) {
                nums[i] /=10;
                count++;
            }
            if (count%2 ==0) {
                evenNumberCount++;
            }
            count = 0;
        }
        return evenNumberCount;
    }

    public static void main(String[] args) {
        int [] nums = {1234,123,123456};
        System.out.println(findNumbers(nums));
    }
}
