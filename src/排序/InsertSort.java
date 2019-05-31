package 排序;

public class InsertSort {
    public static void insertSort(int[] nums) {
        int N = nums.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                }
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 45, 2, 5, 67};
        insertSort(a);
        for (int b :
                a) {
            System.out.println(b);
        }
    }
}
