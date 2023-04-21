package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeSortedArray {
    public static int [] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        return nums1;
    }

    public static void main(String[] args) {
        int [] nums1 =new int[] {1,2,3,0,0,0}; int m = 3;
        int [] nums2 = new int[]{2,5,6}; int n = 3;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }
}
