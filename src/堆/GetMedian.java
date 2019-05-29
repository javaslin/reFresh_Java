package 堆;

import java.io.InputStream;
import java.util.PriorityQueue;

public class GetMedian {
    //大顶堆
    private PriorityQueue<Integer> left=new PriorityQueue<>(((o1, o2) -> o2-o1));
    //小顶堆
    private PriorityQueue<Integer> right=new PriorityQueue<>();
    private int N=0;

    public void Insert(int val){
        if(N%2==0){
            left.add(val);
            right.add(left.poll());
        }else {
            right.add(val);
            left.add(right.poll());
        }
    }

    public Double getMedian(){
        if(N%2==0){
            double median=(left.peek()+right.peek())/2.0;
            return median;
        }else {
            double median=right.peek();
            return median;
        }
    }

}
