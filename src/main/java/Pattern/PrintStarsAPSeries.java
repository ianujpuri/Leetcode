package Pattern;

/**
 *          *
 *         ***
 *        *****
 *       *******
 *      *********
 */
public class PrintStarsAPSeries {

    public static void main(String[] args) {
        printStars(5);
    }

    public static void printStars(int n) {
        for(int i=1;i<=n;i++) {
            for(int s=1;s<=n-i;s++) {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*(i-1)+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
