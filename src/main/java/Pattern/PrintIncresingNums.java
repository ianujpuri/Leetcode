package Pattern;

public class PrintIncresingNums {

    public static void main(String[] args) {
        printNums(5);
    }

    public static void printNums(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1; j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
