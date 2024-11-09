package dsalgos.arrays;

public class ZigZagPattern2DMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        printZigZagPattern(matrix);
    }

    public static void printZigZagPattern(int[][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Empty matrix");
            return;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            boolean reverse = (i%2 != 0);
            if(reverse) {
                parseRows(matrix[i], columns-1, 0, reverse);
            } else {
                parseRows(matrix[i], 0, columns-1, reverse);
            }
            System.out.println();
        }
    }

    private static void parseRows(int[] row, int start, int end, boolean reverse) {
            for (int i = start;
                 reverse ? i >= end : i <= end;
                 i = reverse ? i-1 : i+1) {
                System.out.print( row[i] + " ");
            }
    }
}
