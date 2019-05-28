import java.util.Scanner;

public class ThreeNPlus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String[] b=a.split(" ");
        int c=Integer.parseInt(b[0]);
        int d=Integer.parseInt(b[1]);
        int max=0;
        for(int i=Math.min(c,d);i<=Math.max(c,d);i++){
            int j=i;
            int count=1;
            while (j!=1){
                if(j%2==0){
                    j=j/2;
                    count++;
                }else {
                    j=j*3+1;
                    count++;
                }
            }
            max=Math.max(count,max);
        }
        System.out.println(max);
    }
}
