package arrays;

public class SquaresOfSortedArray {

    /*
    Input: [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
     */

    /**
     * Approach -> Use a two pointer approach, and a resultant array. one pointer is at the start, and the other
     * pointer is at the end,set counter equal to length of array id a1^2 > a2^2 put a2^2 at the counter of result array and decrement the counter, and the end pointer
     * otherwise put a1^2 at the counter and decrement it and increment the start pointer
     * @param A array of sorted numbers
     * @return Array of sorted squares
     */
    public int[] sortedSquares(int[] A) {
        int start = 0;
        int end = A.length - 1;
        int[] result = new int[A.length];
        int counter = A.length - 1;
        while (start <= end) {
            int a1 = A[start] * A[start];
            int a2 = A[end] * A[end];
            if (a1 > a2) {
                result[counter]  = a1;
                start++;
                counter--;
            } else {
                result[counter] = a2;
                end--;
                counter--;
            }
        }
        return result;
    }
}
