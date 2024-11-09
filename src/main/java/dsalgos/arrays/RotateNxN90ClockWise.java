package dsalgos.arrays;

public class RotateNxN90ClockWise {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        rotateMatrix(matrix);
        TransposeNxNMatrix.printMatrix(matrix);
    }

    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        TransposeNxNMatrix.transposeMatrix(matrix);
        System.out.println();
        for(int j = 0; j < n; j++) {
            reverseColumn(matrix, j, matrix.length);
        }
    }

    public static void reverseColumn(int[][] matrix, int j, int rowNum) {
        for(int i = 0; i < rowNum/2; i++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[rowNum-i-1][j];
            matrix[rowNum-i-1][j] = temp;
        }
    }
}
