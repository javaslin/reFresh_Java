package 数组和矩阵;

/**
 * 找出数组中最长的连续1 的个数
 */
public class MaxConsecutiveOnes {

    public int maxConsecutiveOnes(int[] nums) {
        int max = 0, cur = 0;
        for (int n : nums) {
            cur = n == 0 ? 0 : cur + 1;
            max = Math.max(max, cur);
        }
        return max;
    }
}
