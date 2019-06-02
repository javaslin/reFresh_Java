package 笔试;

import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        char[] chars=str.toCharArray();
        chars[0]=String.valueOf(chars[0]).toUpperCase().charAt(0);
        for (int i = 0; i <chars.length-1 ; i++) {
            if(chars[i]==' '||chars[i]=='-'||chars[i]=='.'||chars[i]==','||chars[i]=='\t'||chars[i]=='\\'||chars[i]=='!'){
                chars[i+1]=String.valueOf(chars[i+1]).toUpperCase().charAt(0);
            }
        }
        String a=new String(chars);
        System.out.println(a);
    }
}
