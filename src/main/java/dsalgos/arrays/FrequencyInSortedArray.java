package dsalgos.arrays;

public class FrequencyInSortedArray {

    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 25, 30, 30};
        printFrequency(arr);

        int[] arr1 = {10, 10, 10, 10};
        printFrequency(arr1);

        int[] arr2 = {10, 20, 30};
        printFrequency(arr2);
    }

    public static void printFrequency(int[] arr) {
        int num = arr[0];
        int frequency = 1;
        for (int i = 1; i < arr.length; i++) {
            if (num == arr[i]) frequency++;
            else {
                System.out.println(num + " " + frequency);
                num = arr[i];
                frequency = 1;
            }
        }
        System.out.println(num + " " + frequency);
    }
}
