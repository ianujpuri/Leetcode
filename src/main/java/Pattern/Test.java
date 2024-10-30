package Pattern;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        int[][] arr = {{3,1,2,2},{1,4,4,4},{2,4,2,2},{2,5,2,2}};

        System.out.println("result : " + equalPairs(arr));
        System.out.println("result OPT : " + equalPairsOpt(arr));
    }

    public static int equalPairs(int[][] grid) {
        int result = 0;
        int n = grid[0].length;

        List<int[]> columns = new ArrayList<>();
        columns.toArray(new Integer[0]);
        for(int j=0; j < n; j++) {
            int[] column = new int[grid.length];
            for (int i = 0; i < grid.length; i++) {
                column[i] = grid[i][j];
            }
            columns.add(column);
        }

        for(int i = 0; i < n; i++) {
            for(int j=0; j < n; j++) {
                display(grid[i]);
                System.out.println(" " + Arrays.hashCode(grid[i]));

                display(columns.get(j));
                System.out.println(" " + Arrays.hashCode(columns.get(j)));
                System.out.println();
                if(Arrays.hashCode(grid[i]) == Arrays.hashCode(columns.get(j))) {
                    result = Arrays.equals(grid[i], columns.get(j)) ? result+1 : result;
                }
            }
        }

        return result;
    }


    public static int equalPairsOpt(int[][] grid) {
        int result = 0;
        int n = grid[0].length;

        Map<Integer, int[]> columns = new HashMap<>();
        for(int j=0; j < n; j++) {
            int[] column = new int[grid.length];
            for (int i = 0; i < grid.length; i++) {
                column[i] = grid[i][j];
            }
            columns.put(Arrays.hashCode(column), column);
        }

        for(int i = 0; i < n; i++) {
            int hash = Arrays.hashCode(grid[i]);
            display(grid[i]);
            System.out.println(" " + hash);

            display(columns.get(hash));
            System.out.println(" " + Arrays.hashCode(columns.get(hash)));
            System.out.println();

            if(columns.containsKey(hash) ) {
                result = Arrays.equals(grid[i], columns.get(hash)) ? result+1 : result;
            }
        }

        return result;
    }

    public static void display(int[] arr) {
        if(arr == null) {return;}

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}