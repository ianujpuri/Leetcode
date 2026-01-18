package striver_sde_sheet.array1;

public class MatrixTranspose {


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6},{7, 8, 9}};
        transpose(matrix);

        display(matrix);
    }

    public static void display(int[][] matrix) {
        System.out.print("[ ");
        for(int i =0; i < matrix.length; i++) {
            System.out.print(" [ ");
            for(int j = 0; j< matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print(" ], ");
        }

    }
    public static void transpose(int[][] matrix) {

        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[0].length; j++) {
                swap(matrix, i,j, j, i);
            }
        }
    }

    private static void swap(int[][] matrix, int ri, int rj, int ci, int cj) {
        int temp = matrix[ri][rj];
        matrix[ri][rj] = matrix[ci][cj];
        matrix[ci][cj] = temp;
    }
}
