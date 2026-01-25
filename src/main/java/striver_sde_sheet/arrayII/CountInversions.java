package striver_sde_sheet.arrayII;

/*
https://takeuforward.org/data-structure/count-inversions-in-an-array/
 */
public class CountInversions {

    public static void main(String[] args) {
        CountInversions obj = new CountInversions();
        System.out.println(obj.countInversions(new int[]{1,2,3,4,5}));
        System.out.println(obj.countInversions(new int[]{5,3,2,1,4}));
        System.out.println(obj.countInversions(new int[]{5,4,3,2,1}));

    }

    public int countInversions(int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }

        int result = 0;

        for(int i =0 ; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    result++;
                }
            }
        }

        return result;
    }

    public int countInterversionOptimal(int arr[]) {
        return 0;
    }

    private int evaluatePairs(int arr[], int low, int high) {
        return 0;
    }

    private int compare() {
        return 0;
    }
}
