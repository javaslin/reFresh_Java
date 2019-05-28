package 字符串;

public class FirstNotRepeatingChar {
    public int firstNotRepeatingChar(String str){
        int[] cnts=new int[256];
        for (int i = 0; i <str.length() ; i++) {
            cnts[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if(cnts[str.charAt(i)]==1){
                return i;
            }

        }
        return -1;
    }
}
