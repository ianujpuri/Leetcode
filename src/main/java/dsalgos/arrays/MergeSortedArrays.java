package dsalgos.arrays;

public class MergeSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {


        int maxLenM = nums1.length-1;
        n = n-1;
        m -= 1;
        while(m >= 0 && n >= 0) {
            if(nums1[m] >= nums2[n]) {
                nums1[maxLenM] = nums1[m--];
                maxLenM--;
            } else {
                nums1[maxLenM] = nums2[n--];
                maxLenM--;
            }
        }
        System.out.println(" m = " + m + " n = " + n);
        if( m < 0) {
            for(int i=0; i <=n; i++) {
                nums1[i] = nums2[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {4,5,6,0,0,0};
        int m = 3;

        int[] arr2 = {5,6};
        int n = 2;

        merge(arr1, m, arr2, n);

        for(int i : arr1) {
            System.out.print(i + " ");
        }
    }
}
