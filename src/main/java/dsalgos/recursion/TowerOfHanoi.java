package dsalgos.recursion;

public class TowerOfHanoi {

    public static void main(String[] args) {
        sortDisksTOH(20);
    }
    static void sortDisksTOH(int nDisks) {
        System.out.println("Total number of moves : " + sortDisksTOH(nDisks, 'A', 'B', 'C'));
    }

    private static long sortDisksTOH(int nDisks, char towerA, char towerB, char towerC) {

        if (nDisks == 1) {
            System.out.println("Move " + nDisks + " from " + towerA + " to " + towerC);
            return 1;
        }

        long nMoves = sortDisksTOH(nDisks-1, towerA, towerC, towerB);
        System.out.println("Move " + nDisks + " from " + towerA + " to " + towerC);
        nMoves+=1;
        nMoves+=sortDisksTOH(nDisks-1, towerB, towerA, towerC);

        return nMoves;
    }
}
