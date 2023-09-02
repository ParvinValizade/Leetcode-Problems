package problems.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappearedInArray {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List <Integer> result = new ArrayList<>();
        HashSet<Integer> mark = new HashSet<>();
        for(int i : nums)
            mark.add(i);
        for(int i = 1 ; i <= nums.length ; i++)
            if(!mark.contains(i))
                result.add(i);
        return result;
    }

    public static void main(String[] args) {
       int [] nums = {2,2};
        System.out.println(findDisappearedNumbers(nums));
    }
}
