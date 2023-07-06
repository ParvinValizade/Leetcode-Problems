package problems.arrays;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static int[] replaceElements(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length == 1){
            arr[0] = -1;
        } else {
            for (int j = 1;j<arr.length;j++) {
                int max = arr[j];
                for (int i = j; i < arr.length; i++) {
                    if (max < arr[i]) {
                        max = arr[i];
                    }
                }
                arr[j-1] = max;
            }
        }
        arr[arr.length-1]=-1;
        return arr;
    }

    // --------best solution----------
//    public int[] replaceElements(int[] arr) {
//        int max=-1;
//        for(int i=arr.length-1;i>=0;i--){
//            if(arr[i]>max){
//                int temp=max;
//                max=arr[i];
//                arr[i]=temp;
//            }
//            else
//                arr[i]=max;
//        }
//        return arr;
//    }

    public static void main(String[] args) {
        int [] arr = {17,18,5,4,6,1};

        System.out.println(Arrays.toString(replaceElements(arr)));
//        Output: [18,6,6,6,1,-1]
    }
}
