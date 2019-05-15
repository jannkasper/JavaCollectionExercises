package testing;

import collectionExercises.FrequencySorting;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrequencySortingTest {
    FrequencySorting frequencySorting;

    @Before
    public void initial () {
        frequencySorting = new FrequencySorting();
    }
    @Test
    public void test1 () {
        int[] input = {5,9,1,9,2,9,5,1,9,2,9,5,2,9,2};
        int[] output = {9,9,9,9,9,9,2,2,2,2,5,5,5,1,1};
        assertArrayEquals(output,frequencySorting.sorting(input));
    }
    @Test
    public void test2 () {
        int[] input = {};
        int[] output = {};
        assertArrayEquals(output,frequencySorting.sorting(input));
    }
    public void test3 () {

        assertArrayEquals(null,frequencySorting.sorting(null));
    }

}