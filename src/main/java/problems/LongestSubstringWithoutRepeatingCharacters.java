package problems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();// current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            System.out.println("s.charAt(j):"+s.charAt(j));
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
                System.out.println("i-->"+i);
            }
            ans = Math.max(ans, j - i + 1);
            System.out.println("ans:"+ans);
            map.put(s.charAt(j), j + 1);
            System.out.println("map:"+map);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("swerr"));
    }
}
