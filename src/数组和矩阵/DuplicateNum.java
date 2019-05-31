package 数组和矩阵;

/*
在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
数组中某些数字是重复的，但不知道有几个数字是重复的，
也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 */
public class DuplicateNum {

    public boolean duplicateNum(int[] nums) {
        if (nums == null || nums.length < 1) {
            return false;
        }

        int[] res = new int[1];
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            while (nums[i] != i) {
                if (nums[i] == i) {
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
