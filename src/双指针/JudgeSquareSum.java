package 双指针;

public class JudgeSquareSum {

    public boolean judgeSquareSum(int n){
        int i=0,j=(int)Math.sqrt(n);
        while (i<=j){
            int sum=i*i+j*j;
            if(sum==n){
                return true;
            }else if (sum<n){
                i++;
            }else {
                j--;
            }
        }
        return false;
    }
}
