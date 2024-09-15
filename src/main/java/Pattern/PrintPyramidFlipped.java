package Pattern;

public class PrintPyramidFlipped {

    public static void main(String[] args) {
        printStars(4);
    }

    public static void printStars(int n) {

        for(int i=n; i>=1; i--) {
            for(int s=1; s<=n-i; s++) {
                System.out.print(" ");
            }
            for(int j=2*(i-1)+1; j >=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
