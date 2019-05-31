package 数组和矩阵;

/*
最长连续1
 */
public class FindMaxLongestOnes {
    public int findMaxLongestOnes(int[] nums) {
        int max = 0, cur = 0;
        for (int x :
                nums) {
            cur = x == 0 ? 0 : cur + 1;
            max = Math.max(max, cur);
        }
        return max;
    }
}
