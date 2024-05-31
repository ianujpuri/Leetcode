package dsalgos.arrays;

public class SearchElementRotatedArray {

    static int findElementInRoatatedSortedArray(int[] arr, int e) {

        int paritionIndex = findParitionIndex(arr, 0, arr.length-1);

        if(paritionIndex == -1) {
            return binarySearch(arr, 0, arr.length-1, e);
        }

        if(arr[0] > e) {
            return binarySearch(arr, paritionIndex+1, arr.length-1, e);
        }

        return binarySearch(arr, 0, paritionIndex, e);
    }

    static int binarySearch(int[] arr, int low, int high, int e) {

        if(low > high)
            return -1;

        int mid = (low + high)/2;
        if(arr[mid] == e) {
            return mid;
        } else if(arr[mid] > e) {
            return  binarySearch(arr, low, mid-1, e);
        } else {
            return  binarySearch(arr, mid+1, high, e);
        }
    }

    static int findParitionIndex(int[] arr, int low, int high) {

        if(low > high)
            return -1;
        if(low == high)
            return low;

        int mid = (low + high)/2;
        if(mid < high && arr[mid] > arr[mid+1]) {
            return mid;
        } else if(mid >  low && arr[mid-1] > arr[mid]) {
            return mid-1;
        }

        if(arr[mid] > arr[low]) {
            return findParitionIndex(arr, mid+1, high);
        }

        return findParitionIndex(arr, low, mid-1);
    }


    public static void main(String[] args) {
        int[] A = {5, 6, 7, 8, 9, 10, 1, 2, 3};

        int index = 0;

        System.out.println(index = findParitionIndex(A, 0, A.length));

        System.out.println(A[index]);

        System.out.println("Element 3 is at : "+ findElementInRoatatedSortedArray(A, 8)  + "!!");
    }
}
