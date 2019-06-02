package 排序;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
桶排序

出现频率最多的 k 个元素

设置若干个桶，每个桶存储出现频率相同的数。桶的下标表示数出现的频率，即第 i 个桶中存储的数出现的频率为 i。

把数都放到桶之后，从后向前遍历桶，最先得到的 k 个数就是出现频率最多的的 k 个数。
 */
public class TopKFrequent {

    public List<Integer> topKFrequent(int[] nums,int k){
        Map<Integer,Integer> numsOfFre=new HashMap<>();
        for (int num:nums) {
            numsOfFre.put(num,numsOfFre.getOrDefault(num,0)+1);
        }

        List<Integer>[] buckets=new List[nums.length+1];

        for (int key: numsOfFre.keySet() ) {
            int frequency=numsOfFre.get(key);
            if (buckets[frequency]==null){
                buckets[frequency]=new ArrayList<>();
            }
            buckets[frequency].add(key);
        }

        List<Integer> topK=new ArrayList<>();
        for (int i = buckets.length-1; i >=0&&topK.size()<k ; i--) {
            if(buckets[i]==null) continue;
            if(buckets[i].size()<=(k-topK.size())){
                topK.addAll(buckets[i]);
            }else {
                topK.addAll(buckets[i].subList(0,k-topK.size()));
            }

        }
        return topK;
    }
}
