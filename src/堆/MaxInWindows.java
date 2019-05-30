package 堆;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MaxInWindows {

    public ArrayList<Integer> maxInWindows(int[] nums,int size){
        ArrayList<Integer> ret=new ArrayList<>();
        if(size>nums.length||size<1){
            return ret;
        }
        PriorityQueue<Integer> heap=new PriorityQueue<>((o1, o2) -> o2-o1);
        for (int i = 0; i <size ; i++) {
            heap.add(nums[i]);
        }
        ret.add(heap.peek());
        for (int i = 0,j=i+size; j <nums.length ; i++,j++) {
            heap.remove(nums[i]);
            heap.add(nums[j]);
            ret.add(heap.peek());
        }
        return ret;
    }
}
