package problems.arrays;

public class CheckIfNAndItsDoubleExist {
    public static boolean checkIfExist(int[] arr) {
        boolean check = false;

        for (int j = 0; j<arr.length;j++) {
            for (int i = 0; i<arr.length;i++) {
                if (arr[j]*2==arr[i] && i!=j){
                    check = true;
                    break;
                }
                if (check) break;
                }
            }

        return check;
    }
    public static void main(String[] args) {
        int [] nums = {10,2,5,3};
        System.out.println(checkIfExist(nums));
    }
}
