package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        double median;
        for (int k : nums1) {
            list.add(k);
        }

        for (int i : nums2) {
            list2.add(i);
        }
        if (list2.size() != 0) {
            Map<Integer,Integer> map= new HashMap<>();
            for (Integer integer : list) {
                for (int j = 0; j < list2.size(); j++) {
                    if (integer <= list2.get(j)) {
                        map.put(integer, j);
                        break;
                    } else if (j == (list2.size() - 1)) {
                        map.put(integer, list2.size());
                    }
                }
                list2.add(map.get(integer), integer);
            }

        } else list2 = List.copyOf(list);

        int index = list2.size() / 2;
        if (index == 0) return list2.get(index);
        if (list2.size() % 2 == 0) {
            median = (double) (list2.get(index) + list2.get(index - 1)) / 2;
        } else {
            int t = (list2.size() - 1) / 2;
            median = list2.get(t);
        }
        return median;

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
