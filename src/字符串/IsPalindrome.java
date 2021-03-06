package 字符串;
/*
是否是回文串

 */
public class IsPalindrome {
    public boolean isPalindrome(String str) {//含其他字符
        if (str == null || str.length() == 1) {
            return true;
        }
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                sb.append(c);
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }

    public boolean isPalindrome1(String string){
        int i=0,j=string.length()-1;
        while (i<=j){
            if (string.charAt(i++) != string.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

}
