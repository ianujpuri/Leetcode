package dsalgos.arrays;


/**
 * Problem Statement
 * Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted in ascending from left to right.
 * Integers in each column are sorted in ascending from top to bottom.
 */
public class Search2DArrayII {
        public boolean searchMatrix(int[][] matrix, int target) {

            int col = matrix[0].length-1;
            int row = 0;

            while(col >=0 && row <= matrix.length-1) {
                if(target == matrix[row][col]) {
                    return true;
                } else if(target < matrix[row][col]) {
                    col--;
                } else {
                    row++;
                }
            }

            return false;
        }
}
