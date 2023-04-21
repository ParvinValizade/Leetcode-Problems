package problems;

import java.util.Arrays;

public class DuplicateZeros {
    public static int[] duplicateZeros(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i<n) {
            if (arr[i] == 0) {
                for (int j = n - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                if (i < n - 1) {
                    arr[i + 1] = 0;
                }
                i += 2;
            } else {
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3}; //output  [1,0,0,2,3,0,0,4]
        System.out.println(Arrays.toString(duplicateZeros(nums)));
    }
}
