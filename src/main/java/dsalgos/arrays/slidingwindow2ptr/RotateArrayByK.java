package dsalgos.arrays.slidingwindow2ptr;

import java.util.Arrays;

public class RotateArrayByK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rotateUsingSpace(arr, k);

        System.out.println();

        rotate(arr, k);

    }

    public static void rotate(int[] arr, int k) {
        k = k > arr.length ? k - arr.length : k;


        System.out.println();
        reverseFor(arr, 0, k - 1);
        System.out.println("After first reverse");
        Arrays.stream(arr).forEach((e) -> System.out.print(e + " "));

        reverseFor(arr, k, arr.length - 1);
        System.out.println("\nAfter second reverse");
        Arrays.stream(arr).forEach((e) -> System.out.print(e + " "));

        System.out.println("\nAfter final reverse");
        reverse(arr, 0, arr.length - 1);

        Arrays.stream(arr).forEach((e) -> System.out.print(e + " "));
    }

    private static void rotateUsingSpace(int[] arr, int k) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[((i - k) + arr.length) % arr.length] = arr[i];
        }

        Arrays.stream(temp).forEach((e) -> System.out.print(e + " "));
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void reverseFor(int[] arr, int start, int end) {
        int mid = (end - start+1) / 2;
        for(int i = 0; i < mid; i++) {
            int temp = arr[start+i];
            arr[start+i] = arr[end-i];
            arr[end-i] = temp;
        }
    }
}
