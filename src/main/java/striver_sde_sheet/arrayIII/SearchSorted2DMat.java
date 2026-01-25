package striver_sde_sheet.arrayIII;

import java.util.Optional;

public class SearchSorted2DMat {

    public static void main(String[] args) {
        SearchSorted2DMat finder = new SearchSorted2DMat();
        int[][] input = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        System.out.println(finder.search(input, 61).orElseGet(() -> new Pair(-1, -1)));

    }
    public Optional<Pair> search(int[][] arr, int target) {

        if(arr != null) {
            int startRow = 0;
            int startCol = arr[0].length-1;

            int N = arr.length-1;
            int M = startCol;

            if(target < arr[0][0] || target > arr[N][M]) {
                return Optional.empty();
            }

            while(startRow < arr.length) {
                if(target == arr[startRow][startCol]) {
                    return Optional.of(new Pair(startRow, startCol));
                } else if(target < arr[startRow][startCol]) {
                    return binarySearch(arr[startRow], startRow, target);
                } else {
                    startRow++;
                }
            }

        }

        return Optional.empty();
    }

    private Optional<Pair> binarySearch(int[] arr, int row, int target) {
        int low = 0;
        int high = arr.length-1;
        while(low <= high) {

            int mid = low + (high-low)/2;
            if(arr[mid] == target) {
                return Optional.of(new Pair(row, mid));
            } else if(arr[mid] > target) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return Optional.empty();
    }


    static class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public String toString() {
            return "( " + this.row + ", " + this.col + " )";
        }
    }
}
