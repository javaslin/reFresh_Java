package 字符串;

public class ReverseSentence {
    public static String reverseSentence(String str) {
        if (str == "" || str.length() == 1) {
            return str;
        }
        char[] chars = str.toCharArray();
        int i = 0, j = 0;
        int n = str.length();
        while (j <= n) {
            if (j == n || chars[j] == ' ') {
                reverse(chars, i, j - 1);
                i = j + 1;
            }
            j++;
        }
        reverse(chars, 0, n - 1);
        return new String(chars);

    }

    private static void reverse(char[] chars, int i, int j) {
        while (i < j) {
            swap(chars, i++, j--);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String str = "I am a student.";
        String ans = reverseSentence(str);
        System.out.println(ans);
    }
}
