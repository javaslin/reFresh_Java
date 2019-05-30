package 数组和矩阵;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {

    public boolean containDuplicate(int[] nums){
        Set<Integer> set=new HashSet<>();
        for (int a:nums) {
            set.add(a);
        }
        return set.size()!=nums.length;
    }
}
