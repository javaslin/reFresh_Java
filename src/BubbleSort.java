public class BubbleSort {
    public static void bubbleSort(int[] nums){
        int N=nums.length;
        for (int i = 0; i <N-1 ; i++) {
            for (int j = i+1; j <N-i-1 ; j++) {
                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
    }
    private static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args){
        int[] nums=new int[]{5,3,123,2,54,3};
        bubbleSort(nums);
        for (int i:nums) {
            System.out.println(i);
        }
    }
}
