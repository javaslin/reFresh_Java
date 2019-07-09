package 动态规划;

/**
 * 题目描述：抢劫一排住户，但是不能抢邻近的住户，求最大抢劫量。
 */
public class Rob {

    public int rob(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
        }
        return dp[nums.length];

    }
}
