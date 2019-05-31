package TOP100;

public class MaxSubArray {
    public static void main(String[] args) {
        MaxSubArray max = new MaxSubArray();
        int[] a = new int[]{-3, -2, -1, 1, 2, 3, -10};
        System.out.println(max.maxSubArray(a));
    }

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0];

        for (int i = 1; i < n; i++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
