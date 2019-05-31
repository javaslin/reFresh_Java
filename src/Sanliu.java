public class Sanliu {
    private int[][] dc = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};
    private int[][] dp;


    public int dfs(int[][] matrix, int[][] dp, int i, int j) {
        if (dp[i][j] > 0)
            return dp[i][j];
        int n = matrix.length, m = matrix[0].length;
        int max = 1;
        for (int k = 0; k < 4; k++) {
            int x = dc[k][0] + i;
            int y = dc[k][1] + j;
            if (x < 0 || y < 0 || x >= n || y >= m || matrix[x][y] <= matrix[i][j])
                continue;
            int length = 1 + dfs(matrix, dp, x, y);
            max = Math.max(length, max);
        }
        dp[i][j] = max;
        return max;
    }

    public int longestIncreasingPath(int[][] matrix) {
        int max = 0;
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int n = matrix.length, m = matrix[0].length;
        dp = new int[n][m];

        dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(dfs(matrix, dp, i, j), max);
            }
        }
        return max;
    }


}
