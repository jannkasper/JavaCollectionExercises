package testing;

import collectionExercises.FrequencySorting;
import collectionExercises.PalindromeLinkedList;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class PalindromeLinkedListTest {
    PalindromeLinkedList palindromeLinkedList;

    @Before
    public void initial () {
        palindromeLinkedList = new PalindromeLinkedList();
    }
    @Test
    public void test1 () {
        Integer[] input = {1,2,3,4,5,4,3,2,1};
        assertTrue(palindromeLinkedList.palindromeList(input));
    }
    @Test
    public void test2 () {
        Integer[] input = {1,2,3,4,5,5,4,3,2,1};
        assertTrue(palindromeLinkedList.palindromeList(input));
    }
    @Test
    public void test3 () {
        Integer[] input = {1,2,3,4,5,6,4,3,2,1};
        assertFalse(palindromeLinkedList.palindromeList(input));
    }@Test
    public void test4 () {
        Integer[] input = {};
        assertTrue(palindromeLinkedList.palindromeList(input));
    }

}