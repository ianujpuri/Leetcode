package dsalgos.DynamicProgramming;

import java.util.HashMap;

public class RopeCuttingDP {

    static final HashMap<Integer, Integer> valueStore = new HashMap<>();
    public static void main(String[] args) {
        //Runs slow with this input, and beyond this input, it HANGS!!
        int maxCuts =  maxNumberOfCuts(9, 2, 2,2);
        if(maxCuts <=0) {
            System.out.println("No Solution exists..");
        } else {
            System.out.println("Max number of cuts : " + maxCuts);
        }
    }

    public static int maxNumberOfCuts(int n, int a , int b, int c) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        }

        if(valueStore.get(n) != null){
            return valueStore.get(n);
        }

        int maxA = -1, maxB = -1, maxC = -1;
        if (n >= a) //applying bounds to optimize
                maxA = maxNumberOfCuts(n - a, a, b, c);

        if(n >= b) //applying bounds to optimize
                maxB = maxNumberOfCuts(n - b, a, b, c);

        if(n >= c) //applying bounds to optimize
                maxC = maxNumberOfCuts(n - c, a, b, c);

        int result = Math.max(Math.max(maxA,maxB), maxC);
        if(result < 0) {
            valueStore.put(n, -1);
        } else {
            valueStore.put(n, result+1);
        }

        return valueStore.get(n);
    }
}