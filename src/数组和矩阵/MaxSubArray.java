package 数组和矩阵;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            sum = sum <= 0 ? num : sum + num;
            max = Math.max(max, sum);
        }
        return max;
    }
}
