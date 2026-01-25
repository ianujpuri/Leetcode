package leetcode;

public class RotateMatrix {

    public static void main(String[] args) {
        RotateMatrix rm = new RotateMatrix();
        int matrix[][] = {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9}
                            };
        rm.rotate(matrix);

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void rotate(int[][] matrix) {

        if(matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("Not a N x N matrix..");
        }

        //calculate transpose of the matrix
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse each row
        for(int i = 0; i < matrix.length; i++) {
            rowReversal(matrix[i]);
        }
    }

    private void rowReversal(int[] row) {
        for(int j = 0; j < row.length/2; j++) {
            int temp = row[j];
            row[j] = row[row.length - j - 1];
            row[row.length - j - 1] = temp;
        }
    }
}