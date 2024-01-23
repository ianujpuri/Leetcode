package dsalgos.recursion;

public class SumOfSubsetsToK {

    public static void main(String[] args) {
        final int arr[] = {8,2,6,4};
        final int sum = 10;
        System.out.println(findSubsetsCount(arr, sum, 0));
    }

    static int findSubsetsCount(int arr[], int sum, int level) {
        if(level == arr.length) {
            return sum == 0 ? 1 : 0;
        }

        int count = 0;
        if(sum < arr[level])
            count = findSubsetsCount(arr, sum, level+1);

        count = findSubsetsCount(arr, sum, level+1);
        count +=findSubsetsCount(arr, sum-arr[level], level+1);

        return count;
    }
}
