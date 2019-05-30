package 排序;

public class QuickSort {
    public static void quickSort(int[] nums){
        quickSort(nums,0,nums.length-1);
    }
    public static void quickSort(int[] nums,int l,int h){
        if (h <= l)
            return;
        int j = partition(nums, l, h);
        quickSort(nums, l, j - 1);
        quickSort(nums, j + 1, h);
    }




    private static int partition(int[] nums,int l,int h){
        int i = l, j = h + 1;
        int v = nums[l];
        while (true) {
            while ((nums[++i]< v) && i != h) ;
            while ((v<nums[--j]) && j != l) ;
            if (i >= j)
                break;
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }
    private static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args){
        int[] nums=new int[]{5,3,123,2,54,3};
        quickSort(nums);
        for (int i:nums) {
            System.out.println(i);
        }
    }
}
