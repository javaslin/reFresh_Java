package 数学;

import java.util.Arrays;

/*
数组中出现次数多于 n / 2 的元素
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
