import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sanliu2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int main(int[] a) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int c:a) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        if(map.size()==1){
            return 1;
        }
        boolean flag=true;
        boolean flag1=true;
        int y=map.get(1);
        int max=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k=entry.getValue();
            max=Math.max(k,max);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
             int b=entry.getValue();
             if(y!=b){
                 flag=false;
             }
             if(max%entry.getValue()!=0){
                 flag1=false;
             }
        }
        if(flag==true){
            return a.length/y;
        }
        if(flag1==true){
            return a.length/y;
        }
        return 0;

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String[] nums=b.split(" ");
        int[] aa=new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            aa[i]=Integer.parseInt(nums[i]);
        }


        int res;

        res = main(aa);
        System.out.println(String.valueOf(res));

    }
}

