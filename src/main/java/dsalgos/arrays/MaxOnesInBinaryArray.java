package dsalgos.arrays;

public class MaxOnesInBinaryArray {

    /**
     *
     *  for i = 0 to n-1
     *      count ones
     *      if not one
     *          update max
     *          reset count
     *
     */

    public static void main(String[] args) {
        int[] test1 = { };
        int[] test2 = {0, 0};
        int[] test3 = {0, 1, 1, 0, 0 , 0, 1};
        int[] test4 = {1, 0, 1, 0, 1, 0};
        int[] test5 = {1, 1, 1, 1, 1, 1, 1};

        System.out.println(countMaxOnes(test1));
        System.out.println(countMaxOnes(test2));
        System.out.println(countMaxOnes(test3));
        System.out.println(countMaxOnes(test4));
        System.out.println(countMaxOnes(test5));

        int[] test = new int[100000];
        for (int i = 0; i < test.length; i++) {
            test[i] = (i < 50000) ? 1 : 0; // First 50,000 elements are 1, rest are 0
        }
        System.out.println(countMaxOnes(test));
    }

    private static int countMaxOnes(int arr[]) {
        if (arr == null || arr.length == 0) return 0; // Handle empty array case

        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i < arr.length; i++) {
            count++;
            if(arr[i] != 1) {
                max = Math.max(max, count-1);
                count = 0;
            }
        }
        return Math.max(max, count);
    }
}

