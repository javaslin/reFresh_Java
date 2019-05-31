import java.util.Scanner;


public class WAN1 {
    static int[] dp;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] quan = new int[n];
        for (int i = 0; i < n; i++) {
            quan[i] = in.nextInt();
        }
        int value = in.nextInt();
        dp = new int[value + 1];
        getMin(quan, value, 0);
        if (dp[value] == Integer.MAX_VALUE - 1)
            System.out.println(-1);
        else
            System.out.println(dp[value]);
    }

    private static int min(int a, int b) {
        return a > b ? b : a;
    }

    private static void getMin(int[] money, int value, int i) {
        if (i <= value) {
            if (i == 0) {
                dp[i] = 0;
                getMin(money, value, i + 1);
                return;
            } else {
                int min = Integer.MAX_VALUE - 1;
                for (int j = 0; j < money.length; j++) {
                    if (i >= money[j])
                        min = min(dp[i - money[j]] + 1, min);
                }
                dp[i] = min;
                if (i == value)
                    return;
                else
                    getMin(money, value, i + 1);

            }
        }

    }
}
