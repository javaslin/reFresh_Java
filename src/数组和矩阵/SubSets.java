package 数组和矩阵;

import java.util.ArrayList;
import java.util.List;
/*
给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。

说明：解集不能包含重复的子集。
 */
public class SubSets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length < 1){
            return res;
        }
        res.add(new ArrayList<>());

        for(int i=0; i < nums.length; i++){
            int size = res.size();
            for(int j = 0; j < size; j++){
                List<Integer> list = res.get(j);
                List<Integer> tmpList = new ArrayList<>(list);
                tmpList.add(nums[i]);
                res.add(tmpList);
            }
            System.out.println(res);
        }

        return res;
    }
    public static void main(String[] args){
        int[] nums=new int[]{1,2,3};
        subsets(nums);
    }

}
