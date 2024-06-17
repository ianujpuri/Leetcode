package dsalgos.arrays;

import java.util.Arrays;

/**
 * There are n seats and n students in a room.
 * You are given an array seats of length n,
 * where seats[i] is the position of the ith seat.
 * <p>
 * You are also given the array students of length n,
 * where students[j] is the position of the jth student.
 * <p>
 * You may perform the following move any number of times:
 * <p>
 * Increase or decrease the position of the ith student by 1
 * (i.e., moving the ith student from position x to x + 1 or x - 1)
 * Return the minimum number of moves required to move each student
 * to a seat such that no two students are in the same seat.
 * <p>
 * Note that there may be multiple seats or students in the same
 * position at the beginning.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: seats = [3,1,5], students = [2,7,4]
 * Output: 4
 * Explanation: The students are moved as follows:
 * - The first student is moved from from position 2 to position 1 using 1 move.
 * - The second student is moved from from position 7 to position 5 using 2 moves.
 * - The third student is moved from from position 4 to position 3 using 1 move.
 * In total, 1 + 2 + 1 = 4 moves were used.
 */
public class MinMoveSeatsStudents {

    /*
     * Building Approach to choose right DS and Algo:
     *
     * Pattern:
     * Map a Student to a Seat, restricting one student per seat
     * Initial Thought:
     * Using HashMap to store Student[i] as Key, Seat[j] as value
     *
     * Another Pattern:
     * To minimize moves, we must find the nearest possible seat to the
     * current position of the student. Sorting the position of both
     * students and seats can help.
     *
     * Two ways to do it...
     * 1. Sort seat array and for each student at Jth position,
     * perform binary search to find the nearest seat. nlogn + nlogn
     *
     * 2. Sort both the arrays seat and student. calculate abs difference
     * at ith positon for seat and student.
     *
     *
     */
    public int minMovesToSeat(int[] seats, int[] students) {

        Arrays.sort(seats);
        Arrays.sort(students);

        // Map<Integer, Integer> map = new HashMap<>();
        int moves = 0;
        //check for nearest seat non-occupied seat
        for (int i = 0; i < seats.length; i++) {
            moves += Math.abs(seats[i] - students[i]);
        }

        return moves;
    }


}
