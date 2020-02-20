import java.util.Arrays;

public class My2DArrayPractice {


    public static boolean evenRow(int[][] mat, int row) {
        for (int num : mat[row]) {
            if (num % 2 == 1) {
                return false;
            }
        }
        return true;
    }


    public static boolean oddColSum(int[][] nums, int col) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i][col];
            sum += num;
        }
        if (sum % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] minRow(int[][] nums) {
        int minValue = nums[0][0];
        int minRow = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] < minValue) {
                    minValue = nums[i][j];
                    minRow = i;
                }
            }
        }
        return nums[minRow];
    }

    public static void main(String[] args) {
        int[][] nums = {{-4, 2, 3, 4}, {-10, 69, 1000000, 88}, {-1, 11, 111, 1111}};
        int row = 0;

        System.out.println("colsMax: " + oddColSum(nums, row));

        System.out.println("allRowSums: " + Arrays.toString(minRow(nums)));

        System.out.println("colAves: " + evenRow(nums, row));
    }
}