package problems;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        int start = 0, end = 0;
        if (s == null || s.length() < 1) {
            System.out.println("");
        } else {

            for (int i = 0; i < s.length(); i++) {
                int len1 = expandAroundCenter(s, i, i);
                System.out.println("len1 = "+len1);
                int len2 = expandAroundCenter(s, i, i + 1);
                System.out.println("len2 = "+len2);
                int len = Math.max(len1, len2);
                System.out.println("len = "+len);
                System.out.println("end = " + end);
                System.out.println("start = " + start);
                if (len > end - start) {
                    start = i - (len - 1) / 2;
                    end = i + len / 2;
                    System.out.println("end = " + end);
                    System.out.println("start = " + start);
                }
            }
        }
        System.out.println(s.substring(start, end + 1));
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        System.out.println("L = "+L);
        System.out.println("R = "+R);
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            System.out.println("s.charAt(L) = "+s.charAt(L));
            System.out.println("s.charAt(R) = "+s.charAt(R));
            L--;
            R++;
            System.out.println("L = "+L);
            System.out.println("R = "+R);
        }
        return R - L - 1;
    }
}
