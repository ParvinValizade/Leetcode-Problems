package problems.arrays;

public class HeightChecker {

    public static int heightChecker(int[] heights) {
        int count = 0;
        int n = heights.length;
        int temp;
        int[] heightsCopy = new int[n];
        System.arraycopy(heights, 0, heightsCopy, 0, n);


        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (heights[j - 1] > heights[j]) {
                    temp = heights[j - 1];
                    heights[j - 1] = heights[j];
                    heights[j] = temp;
                }

            }
        }

        for (int i = 0; i < heights.length; i++) {
            if (heightsCopy[i] != heights[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(heights));
    }
}
