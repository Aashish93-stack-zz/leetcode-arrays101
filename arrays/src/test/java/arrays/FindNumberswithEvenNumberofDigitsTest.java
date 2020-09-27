package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNumberswithEvenNumberofDigitsTest {

    @Test
    public void testEven() {
        FindNumberswithEvenNumberofDigits fn = new FindNumberswithEvenNumberofDigits();
        int[] n = new int[] {12, 345, 2, 6, 7896};
        assertEquals(fn.findNumbers(n), 2);

        n = new int[] {555, 901, 482, 1771};
        assertEquals(fn.findNumbers(n), 1);

        n = new int[] {555, 901, 482, 177};
        assertEquals(fn.findNumbers(n), 0);
    }

}