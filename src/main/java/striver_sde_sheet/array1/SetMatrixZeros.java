package striver_sde_sheet.array1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        matrix = setMatrixZeros(matrix);

        Arrays.stream(matrix).forEach(e -> {Arrays.stream(e).forEach(System.out::print);
            System.out.println();});
    }

    private static int[][] setMatrixZeros(int[][] matrix) {

        Set<Integer> markedRows = new HashSet<>();
        Set<Integer> markedColumns = new HashSet<>();

        for(int i=0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    markedColumns.add(j);
                    markedRows.add(i);
                }
            }
        }

        for(int i =0; i< matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(markedRows.contains(i) || markedColumns.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }
}
