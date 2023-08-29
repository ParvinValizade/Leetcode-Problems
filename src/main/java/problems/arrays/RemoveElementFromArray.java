package problems.arrays;

public class RemoveElementFromArray {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int count = 0;
        int length = nums.length;
        while (i < length) {
            if (nums[i] == val) {
                count++;
                length--;
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
            } else {
                i++;
            }
        }
        return nums.length - count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 2, 5, 2, 2, 0};
        System.out.println(removeElement(nums, 2));
    }
}
