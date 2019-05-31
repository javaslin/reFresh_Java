package 数组和矩阵;

public class FindNumOfMatrix {

    public boolean findNumOfMatrix(int[][] array, int target) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }
        int i = array[0].length - 1;
        int j = array.length - 1;
        int row = 0, col = i;
        while (row <= j && col >= 0) {
            if (array[row][col] == target) {
                return true;
            } else if (array[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}
