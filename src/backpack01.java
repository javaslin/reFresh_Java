import java.util.Scanner;

public class backpack01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] time = new int[n];
        int [] grade = new int[n];
        for (int i = 0; i < n; i++) {
            grade[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            time[i] = in.nextInt();
        }

        int target = in.nextInt();
        int[][] tpp = new int[n][target + 1];
        for (int i = time[0]; i <= target; i++) {
            tpp[0][i] = grade[0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = time[i]; j <= target; j++) {
                tpp[i][j] = Math.max(tpp[i-1][j],tpp[i-1][j - time[i]] + grade[i]);
            }
        }

        System.out.println(tpp[n-1][target]);

    }
}
