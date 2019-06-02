package 笔试;


import java.util.Scanner;

public class QPailie{
    private static int cnt;
    public static void permutation(char[] s,int from,int to) {
        if(to <= 1)
            return;
        if(from == to) {
            for (int i = 0; i <s.length-1 ; i++) {
                if((s[i]=='a'&&s[i+1]=='e')||(s[i]=='a'&&s[i+1]=='i')||(s[i]=='a'&&s[i+1]=='o')||(s[i]=='e'&&s[i+1]=='a')||(s[i]=='i'&&s[i+1]=='a')||(s[i]=='o'&&s[i+1]=='a')||(s[i]=='i'&&s[i+1]=='e')||(s[i]=='e'&&s[i+1]=='i')||(s[i]=='e'&&s[i+1]=='o')||(s[i]=='o'&&s[i+1]=='e')||(s[i]=='i'&&s[i+1]=='o')||(s[i]=='o'&&s[i+1]=='i')){
                    return;
                }
            }
            cnt++;
        } else {
            for(int i=from; i<=to; i++) {
                swap(s,i,from);
                permutation(s, from+1, to);
                swap(s,from,i);
            }
        }

    }
    public static void toZero(){
        cnt=0;
    }

    public static void swap(char[] s,int i,int j) {
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String rows=scanner.nextLine();
        int a=Integer.parseInt(rows);
        String[] strings=new String[a];
        for (int i = 0; i <a ; i++) {
            String b=scanner.nextLine();
            strings[i]=b;

        }
        for (int i = 0; i <a ; i++) {
            char[] s=strings[i].toCharArray();
            permutation(s, 0, s.length-1);
            System.out.println(cnt);
            cnt=0;
        }



    }

}
