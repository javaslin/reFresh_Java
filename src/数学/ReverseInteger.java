package 数学;

public class ReverseInteger {


    public static void main(String[] args) {
        System.out.println(reverse(-987));
    }

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int temp = result * 10 + x % 10;
            if (temp / 10 != result)
                return 0;
            result = temp;
            x = x / 10;
        }
        return result;
    }
}
