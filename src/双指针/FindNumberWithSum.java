package 双指针;

import java.util.ArrayList;
import java.util.Arrays;

public class FindNumberWithSum {

    public ArrayList<Integer> findNumberWithSum(int[] nums, int sum) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int cur = nums[i] + nums[j];
            if (cur == sum) {
                return new ArrayList<>(Arrays.asList(nums[i], nums[j]));
            } else if (cur > sum) {
                j--;
            } else {
                i++;
            }
        }
        return new ArrayList<>();
    }
}
