import java.util.Scanner;

public class MaxNumber {
    private static int getMaxNumber(int num){
        if(num==1) return 1;
        int max=0;
        do{
            if(num%2==0){
                num/=2;
                max=Math.max(num,max);
            }else {
                num=num*3+1;
                max=Math.max(num,max);
            }
        }while (num!=1);
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int max=0;
        for (int i = 1; i <=num ; i++) {
            max=Math.max(getMaxNumber(i),max);
        }
        System.out.println(max);
    }
}
