package Pattern;


/*
Given n print n stars in each row for n total rows
****
****
****
****
 */
public class PrintStarsSimple {

    public static void main(String[] args) {
        printStars(4);
        System.out.println("\n");
        printStars(5);
    }

    public static void printStars(int n) {
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
