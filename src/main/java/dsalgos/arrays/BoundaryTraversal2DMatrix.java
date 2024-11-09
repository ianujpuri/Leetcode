package dsalgos.arrays;

public class BoundaryTraversal2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] singleRowMatrix = {{1, 2, 3}};
        int[][] singleColumnMatrix = {{4}, {5}, {6}};
        traverse2DMatrix(matrix);
    }

    public static void traverse2DMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Empty matrix");
            return;
        }

        int rowNums = matrix.length;
        int colNums = matrix[0].length;
        if(rowNums == 1) {
            for (int j = 0; j < colNums; j++) {
                System.out.print(matrix[0][j] + "\t");
            }
        } else if(colNums == 1) {
            for (int i = 0; i < rowNums; i++) {
                System.out.print(matrix[i][0] + "\t");
            }
        } else {
            for (int j = 0; j < colNums; j++) {
                System.out.print(matrix[0][j] + "\t");
            }

            for (int i = 1; i < rowNums; i++) {
                System.out.print(matrix[i][colNums - 1] + "\t");
            }

            for (int j = colNums - 2; j >= 0; j--) {
                System.out.print(matrix[rowNums - 1][j] + "\t");
            }

            for (int i = rowNums - 2; i > 0; i--) {
                System.out.print(matrix[i][0] + "\t");
            }
        }
    }
}
