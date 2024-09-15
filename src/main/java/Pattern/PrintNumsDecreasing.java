package Pattern;

public class PrintNumsDecreasing {

    public static void main(String[] args) {
        printStars(5);
    }

    public static void printStars(int n) {
        for(int i=n; i >=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
