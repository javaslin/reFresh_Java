import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int f=Integer.parseInt(a);
        int[] b=new int[f];
        for (int i = 0; i <f ; i++) {
            b[i]=Integer.parseInt(sc.nextLine());
        }
        List<String> list=new ArrayList<>();
        for (int i = 0; i <f ; i++) {
           String[] d=String.valueOf(b[i]).split("");
           int cnt=0;
           for (String y:
                 d) {
                if(b[i]%Integer.parseInt(y)==0){
                    cnt++;
                }
           }
           if(cnt==d.length){
               list.add("G");
           }else if(cnt==0){
               list.add("S");
           }else {
               list.add("H");
           }

        }
        for (String str:
             list) {
            System.out.println(str);
        }
    }
}
