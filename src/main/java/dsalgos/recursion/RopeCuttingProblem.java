package dsalgos.recursion;

public class RopeCuttingProblem {

    public static void main(String[] args) {
        //Runs slow with this input, and beyond this input, it HANGS!!
        System.out.println("result : "+ maxNumberOfCuts(31, 1, 1,1));
    }

    public static int maxNumberOfCuts(int n, int a , int b, int c) {
        if(n < 0 ) {
            return -1;
        } else if (n == 0) {
            return 0;
        }

        int maxA=-1, maxB=-1, maxC=-1;
        if(n >= a) //applying bounds to optimize
            maxA = maxNumberOfCuts(n-a, a,b,c);

        if(n >= b) //applying bounds to optimize
            maxB = maxNumberOfCuts(n-b, a,b,c);

        if(n >= c) //applying bounds to optimize
            maxC = maxNumberOfCuts(n-c, a,b,c);

       int result = Math.max(Math.max(maxA,maxB), maxC);
       if(result < 0) {
           return -1;
       }

       return 1 + result;
    }
}
