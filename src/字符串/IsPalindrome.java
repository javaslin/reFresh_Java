package 字符串;
public class IsPalindrome {
    public boolean isPalindrome(String str){
        if(str==null || str.length()==1){
            return true;
        }
        str=str.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for (char c:str.toCharArray()) {
            if((c>='0'&&c<='9')||(c>='a'&&c<='z')){
                sb.append(c);
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}
