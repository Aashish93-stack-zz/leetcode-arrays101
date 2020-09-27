package arrays;

public class MaxConsecutiveOnes {
    /*
    Input: [1,1,0,1,1,1]
    Output: 3
    Explanation: The first two digits, or the last three digits are consecutive 1s.
        The maximum number of consecutive 1s is 3.
     */

    /**
     * In this approach, iterate over thr list, if current element == 1 then increment i till a current element is not equal to 1. then compare cour counter with global counter and set counter to the max of it.
     * @param nums  arrays of numbers
     * @return Number of max Consecutive ones
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive = 0;
        if (nums == null || nums.length == 0)
            return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int counter = 1;
                i = i + 1;
                while(i < nums.length) {
                    if (nums[i] != 1)
                        break;
                    counter += 1;
                    i += 1;
                }
                maxConsecutive = Math.max(maxConsecutive, counter);
            }
        }
        return maxConsecutive;
    }
}
