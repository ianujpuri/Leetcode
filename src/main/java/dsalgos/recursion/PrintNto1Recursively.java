package dsalgos.recursion;

public class PrintNto1Recursively {

    public static void main(String[] args) {
        printNto1(10);
    }
    static void printNto1(int n) {

        if(n == 0) {
            return;
        }

        System.out.println(n);
        printNto1(n-1);
    }
}
