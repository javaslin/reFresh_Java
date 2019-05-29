package 数学;

public class ConvertToBase7 {


    public static String convertToBase7(int num){
        if(num==0) return "0";
        boolean isNegative=num<0;
        if(isNegative) num=-num;
        StringBuilder sb=new StringBuilder();
        while(num>0){
            sb.append(num%7);
            num/=7;
        }
        String res=sb.reverse().toString();
        return isNegative?"-"+res:res;
    }
    public static void main(String[] args){
        System.out.println(convertToBase7(7777));
    }


}
