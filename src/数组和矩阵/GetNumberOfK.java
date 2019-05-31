package 数组和矩阵;

/*
统计一个数字在排序数组中出现的次数。
 */
public class GetNumberOfK {

    public int getNumberOfK(int[] nums, int k) {
        int first = binarySearch(nums, k);
        int last = binarySearch(nums, k + 1);
        return (first == nums.length || nums[first] != k) ? 0 : last - first;
    }

    private int binarySearch(int[] nums, int k) {
        int l = 0, h = nums.length;

        while (l < h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] >= k) {
                h = mid;
            } else {

                l = mid + 1;
            }
        }
        return l;
    }

}
