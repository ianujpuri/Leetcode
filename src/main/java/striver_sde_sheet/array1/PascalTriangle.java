package striver_sde_sheet.array1;

import java.util.Arrays;

public class PascalTriangle {

    public static void main(String[] args) {
        System.out.println(find(5, 3, 2));
        System.out.println(findNthValue( 3, 2));
    }

    private static int find(int N, int r, int c) {
        int[][] arr = new int[N][N];
        arr[1][1] = 1;
        for(int i = 0; i < arr.length; i++) {
            arr[i][0] = 1;
        }

        return find(arr, r, c);
    }

    private static int find(int[][] matrix, int r, int c) {

        for(int i = 2; i < matrix.length; i++) {
            for( int j = 1; j <= i; j++) {
                matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j];
            }
        }

        return matrix[r-1][c-1];
    }

    private static long findNthValue(int r, int c) {

        return nCr(r-1, c-1);
    }

    private static long nCr(int n, int r) {
        long ans = 1;
        for(int i=0 ; i <r; i++) {
            ans *= (n-i);
            ans /= (i+1);
        }

        return ans;
    }
}
