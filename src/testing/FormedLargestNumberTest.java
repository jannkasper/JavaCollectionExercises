package testing;

import collectionExercises.FormedLargestNumber;
import collectionExercises.FrequencySorting;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FormedLargestNumberTest {
    FormedLargestNumber formedLargestNumber;
    @Before
    public void initial () {
        formedLargestNumber = new FormedLargestNumber();
    }
    @Test
    public void test1 () {
        int[] input = {54, 546, 548, 60};
        assertEquals("6054854654", formedLargestNumber.largestNumber(input));
    }
    @Test
    public void test2 () {
        int[] input = {};
        assertEquals(null, formedLargestNumber.largestNumber(input));
    }
    @Test
    public void test3 () {
        int[] input = null;
        assertEquals(null, formedLargestNumber.largestNumber(input));
    }

}