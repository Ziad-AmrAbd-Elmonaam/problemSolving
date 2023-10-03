import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSumNumber twoSumNumber = new TwoSumNumber();

        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSumNumber.twoSum(nums1, target1);
        printResult(nums1, target1, result1);

        // Example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSumNumber.twoSum(nums2, target2);
        printResult(nums2, target2, result2);

        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSumNumber.twoSum(nums3, target3);
        printResult(nums3, target3, result3);
    }

    private static void printResult(int[] nums, int target, int[] result) {
        if (result.length == 2) {
            System.out.printf("For nums = %s and target = %d, the indices are [%d, %d]%n",
                    Arrays.toString(nums), target, result[0], result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
