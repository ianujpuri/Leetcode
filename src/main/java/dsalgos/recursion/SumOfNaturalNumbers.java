package dsalgos.recursion;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        System.out.println(sumOf1ToN(10));
    }

    static int sumOf1ToN(int n) {

        if(n <= 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }

        return n + sumOf1ToN(n-1);
    }
}
