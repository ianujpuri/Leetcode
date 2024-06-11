package dsalgos.arrays;

public class Search2DArray {

    public static void main(String[] args) {
        int matrxi[][] ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(" 3 exists : " + searchMatrix(matrxi, 3));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;
        System.out.printf(" left %d, right %d\n", left, right);

        while (left <= right) {
            int middle = left + (right - left) / 2;
            int row = middle / matrix[0].length;
            int col = middle % matrix[0].length;
            System.out.printf(" middle %d, row %d, col %d\n", middle, row, col);

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return false;
    }


    public static boolean searchMatrix1(int[][] matrix, int target) {

        int lastCol = matrix[0].length - 1;
        int lastRow = matrix.length - 1;

        //handle edge cases

        //smaller than smallest
        if(target < matrix[0][0]) return false;

        //larger than largest
        if(target > matrix[lastRow][lastCol]) return false;

        int row = binarySearchCol(matrix, lastCol, target);
        System.out.println("row : " + row);
        int col = binarySearchRow(matrix, row, target);
        System.out.println("col :" + col);

        return target == matrix[row][col];
    }

    public static int binarySearchCol(int[][] matrix, int cIndex, int key) {
        int low = 0;
        int high = matrix.length - 1;
        System.out.println("h : " + high);
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key == matrix[mid][cIndex]) {
                return mid;
            } else {
                if (key < matrix[mid][cIndex]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return key <= matrix[mid][cIndex] ? mid : mid+1;
    }

    public static int binarySearchRow(int[][] matrix, int rIndex, int key) {
        int low = 0;
        int high = matrix[rIndex].length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key == matrix[rIndex][mid]) {
                return mid;
            } else {
                if (key < matrix[rIndex][mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return mid;
    }
}
