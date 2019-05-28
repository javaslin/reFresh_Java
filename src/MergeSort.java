public class MergeSort {
    private int[] aux;
    public  void merge(int[] nums,int l,int m,int h){
        int i=l,j=m+1;
        for (int k = l; k <=h ; k++) {
            aux[k]=nums[k];
        }
        for (int k = l; k <= h; k++) {
            if (i > m) {
                nums[k] = aux[j++];

            } else if (j > h) {
                nums[k] = aux[i++];

            } else if (aux[i]<=aux[j]) {
                nums[k] = aux[i++]; // 先进行这一步，保证稳定性

            } else {
                nums[k] = aux[j++];
            }
        }
    }
    public void mergeSort(int[] nums){
        aux=new int[nums.length];
        mergeSort(nums,0,nums.length-1);

    }
    public void mergeSort(int[] nums,int l,int h){
        if (h <= l) {
            return;
        }
        int mid = l + (h - l) / 2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, h);
        merge(nums, l, mid, h);

    }
    public static void main(String[] args){
        MergeSort mergeSort=new MergeSort();
        int[] nums=new int[]{5,3,123,2,54,3};
        mergeSort.mergeSort(nums);
        for (int i:nums) {
            System.out.println(i);
        }
    }
}
