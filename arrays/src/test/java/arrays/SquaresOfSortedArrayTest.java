package arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SquaresOfSortedArrayTest {

    @Test
    public void testSSA() {
        int[] arr = {-4, -1, 0, 3, 10};
        SquaresOfSortedArray arra = new SquaresOfSortedArray();
        assertEquals(Arrays.toString(arra.sortedSquares(arr)),
                Arrays.toString(new int[] {0, 1, 9, 16, 100}));
        int[] arr2 = {-7,-3,2,3,11};
        assertEquals(Arrays.toString(arra.sortedSquares(arr2)),
                Arrays.toString(new int[] {4,9,9,49,121}));
    }

}