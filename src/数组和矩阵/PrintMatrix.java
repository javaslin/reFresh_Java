package 数组和矩阵;

import java.util.ArrayList;

public class PrintMatrix {
    private ArrayList<Integer> res;

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        res = new ArrayList<>();
        int tR = 0, tC = 0, dR = matrix.length - 1, dC = matrix[0].length - 1;
        while (tC <= dC && tR <= dR) {
            printEdge(matrix, tR++, tC++, dR--, dC--);
        }
        return res;

    }

    private void printEdge(int[][] m, int tR, int tC, int dR, int dC) {
        if (tR == dR) {
            for (int i = tC; i <= dC; i++) {
                res.add(m[tR][i]);
            }
        } else if (tC == dC) {
            for (int i = tR; i <= dR; i++) {
                res.add(m[i][tC]);
            }
        } else {
            int curC = tC;
            int curR = tR;
            while (curC != dC) {
                res.add(m[tR][curC]);
                curC++;
            }
            while (curR != dR) {
                res.add(m[curR][dC]);
                curR++;
            }
            while (curC != tC) {
                res.add(m[dR][curC]);
                curC--;
            }
            while (curR != tR) {
                res.add(m[curR][tC]);
                curR--;
            }


        }
    }
}
