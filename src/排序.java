import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 排序 {
    public void selectSort(int[] nums) {
        int N = nums.length;
        for (int i = 0; i < N - 1; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(nums[j], nums[min])) {
                    min = j;
                }
            }
            swap(nums, i, min);
        }
    }

    public void insertSort(int[] nums) {
        int N = nums.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(nums[j], nums[j-1]); j--) {
                swap(nums, j, j - 1);
            }
        }
    }
    public void bubbleSort(int[] nums){
        int N=nums.length;
        boolean hasSorted=false;
        for (int i = N-1; i >0 && !hasSorted ; i--) {
            hasSorted=true;
            for (int j = 0; j <i ; j++) {
                if(less(nums[j+1],nums[j])){
                    hasSorted=false;
                    swap(nums,j,j+1);
                }
            }
        }
    }
    public void quickSort(Integer[] nums){
        shuffle(nums);
        quickSort(nums,0,nums.length-1);

    }
    private void quickSort(Integer[] nums,int l,int h){
        if (h <= l)
            return;
        int j = partition(nums, l, h);
        quickSort(nums, l, j - 1);
        quickSort(nums, j + 1, h);
    }
    private void shuffle(Integer[] nums){
        List<Integer> list=Arrays.asList(nums);
        Collections.shuffle(list);
        list.toArray(nums);
    }

    private int partition(Integer[] nums,int l,int h){
        int i = l, j = h + 1;
        Integer v = nums[l];
        while (true) {
            while (less(nums[++i], v) && i != h) ;
            while (less(v, nums[--j]) && j != l) ;
            if (i >= j)
                break;
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }

    private boolean less(int a, int b) {
        return a - b < 0;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    private void swap(Integer[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


    public static void main(String[] args) {
        排序 a = new 排序();
        int[] nums = new int[]{5, 2, 34, 1, 2, 1, 5, 6};
        a.insertSort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
