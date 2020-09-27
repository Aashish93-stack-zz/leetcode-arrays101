package arrays;

public class FindNumberswithEvenNumberofDigits {

    /*
    Input: nums = [12,345,2,6,7896]
    Output: 2
    Explanation:
    12 contains 2 digits (even number of digits).
    345 contains 3 digits (odd number of digits).
    2 contains 1 digit (odd number of digits).
    6 contains 1 digit (odd number of digits).
    7896 contains 4 digits (even number of digits).
    Therefore only 12 and 7896 contain an even number of digits.
     */

    /**
     * In this approach, we convert array to string and check if length % 2 == 0 if yes increment the counter
     * Another approach would be to make use of the range limitations and and if else check which would be a tad faster
     * Ex 10<=num <= 99 || 1000<=num <= 9999
     * @param nums arrays of numbers
     * @return no of integers which is even valued
     */
    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int i : nums) {
            if (String.valueOf(i).length() % 2 == 0)
                counter += 1;
        }
        return counter;
    }
}
