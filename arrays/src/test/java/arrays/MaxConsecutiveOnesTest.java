package arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxConsecutiveOnesTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public  void testMaxConsecutiveOne() {
        MaxConsecutiveOnes ones = new MaxConsecutiveOnes();
        int[] nums = {1,1,0,1,1,1};
        assertEquals(ones.findMaxConsecutiveOnes(nums), 3);

        nums = new int[]{1, 1, 1, 1, 1, 1};
        assertEquals(ones.findMaxConsecutiveOnes(nums), 6);

        assertEquals(ones.findMaxConsecutiveOnes(null), 0);

        nums = new int[]{1, 1, 0, 0, 1, 1};
        assertEquals(ones.findMaxConsecutiveOnes(nums), 2);
    }
}