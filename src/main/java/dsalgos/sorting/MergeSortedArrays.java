package dsalgos.sorting;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArrays {

    /**
     *
     * empty of size nA + nB
     * for i = 0 to n-1
     *  compare firstA with firstB
//     *     smaller into new array
//     *
//     */
//    public static void main(String[] args) {
//        int[] listA = {1,3};
//
//       int[] listB = {2,4,6,8,10};
//
//        System.out.println(new MergeSortedArrays().merge(listA, listB));
//
//    }
//
//    private List<Integer> merge(int[] listA, int[] listB) {
//        List<Integer> result = new ArrayList<>(list + listB.size());
//
//       int ptrA = 0;
//       int ptrB = 0;
//
//       while(ptrA  < listA.size() &&  ptrB < listB.size()) {
//           if(listA.get(ptrA) < listB.get(ptrB)) {
//               result.add(listA.get(ptrA));
//               ptrA++;
//           } else {
//               result.add(listB.get(ptrB));
//               ptrB++;
//           }
//       }
//
//       while(ptrA < listA.size()) {
//           result.add(listA.get(ptrA++));
//       }
//
//       while(ptrB < listB.size()) {
//           result.add(listB.get(ptrB++));
//       }
//
//       return result;
//    }
}
