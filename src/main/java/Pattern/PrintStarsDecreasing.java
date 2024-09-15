package Pattern;

public class PrintStarsDecreasing {

    public static void main(String[] args) {
        printStars(5);
    }

    public static void printStars(int n) {
        for(int i=n; i >=1; i--) {
            for(int j=i; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
