package problems.arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        Map<Integer,Integer> maxIndexAndValue = new HashMap<>();
        if (arr.length<=2){
            return false;
        }
        int max = arr[0];
        maxIndexAndValue.put(max,0);
        for (int i = 1;i<arr.length;i++) {
            if (arr[i]>=max) {
                max = arr[i];
                maxIndexAndValue.put(max,i);
            }
        }
        int index = maxIndexAndValue.get(max);
        if (index==0 || index==arr.length-1) {
            return false;
        }
        for (int i = 0;i<index;i++) {
            for (int j = i+1;j<=index;j++) {
                if (arr[i]>=arr[j]) {
                    return false;
                }
            }
        }

        for (int i = arr.length-1;i>index;i--) {
            for (int j = i-1;j>=index;j--){
                if (arr[i]>=arr[j]) {
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int []  nums = {4,4,3,2,1};
        System.out.println(validMountainArray(nums));
    }
}
