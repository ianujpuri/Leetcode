package dsalgos.arrays;

public class IncreasingTriplets {

    public static void main(String[] args) {
        int arr[] = {2,1,5,4,3,1};
        System.out.println(existsIncreasingTriplets(arr));
    }

    public static boolean existsIncreasingTriplets(int[] arr) {
        int min_first = Integer.MAX_VALUE;
        int min_second = Integer.MAX_VALUE;

        for(int num : arr) {
            if(num < min_first) min_first = num;
            else if(num < min_second) min_second = num;
            else return true;
        }

        return false;
    }


}
