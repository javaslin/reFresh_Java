package 数组和矩阵;

import java.util.HashMap;
import java.util.Map;

/**
 * Input: [1,3,2,2,5,2,3,7]
 * Output: 5
 * Explanation: The longest harmonious subsequence is [3,2,2,2,3].
 * Copy to clipboardErrorCopied
 * 和谐序列中最大数和最小数之差正好为 1，
 * 应该注意的是序列的元素不一定是数组的连续元素。
 */
public class LongestHSub {

    public int findLgst(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : nums) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int longest = 0;
        for (int b : map.keySet()) {
            if (map.containsKey(b + 1)) {
                longest = Math.max(map.get(b + 1) + map.get(b), longest);
            }
        }
        return longest;
    }
}
