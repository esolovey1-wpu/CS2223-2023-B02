package edu.wpi.cs2223.week1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class BinarySearchTest {
    @Test
    public void doesValueExist_falseEmptyArray(){
        int[] inputArray = new int[]{};

        BinarySearch search = new BinarySearch();
        assertFalse(search.doesValueExist(inputArray, 101));
    }

    @Test
    public void doesValueExist_false(){
        int[] inputArray = new int[]{ 1, 9, 100, 564, 999 };

        BinarySearch search = new BinarySearch();
        assertFalse(search.doesValueExist(inputArray, 101));
    }

    @Test
    public void doesValueExist_falseOutOfRangeLow(){
        int[] inputArray = new int[]{ 1, 9, 100, 564, 999 };

        BinarySearch search = new BinarySearch();
        assertFalse(search.doesValueExist(inputArray, -101));
    }

    @Test
    public void doesValueExist_falseOutOfRangeHigh(){
        int[] inputArray = new int[]{ 1, 9, 100, 564, 999 };

        BinarySearch search = new BinarySearch();
        assertFalse(search.doesValueExist(inputArray, 9001));
    }

    @Test
    public void doesValueExist_trueSingleValue(){
        int[] inputArray = new int[]{ 1};

        BinarySearch search = new BinarySearch();
        assertTrue(search.doesValueExist(inputArray, 1));
    }

    @Test
    public void doesValueExist_true(){
        int[] inputArray = new int[]{ 1, 9, 100, 564, 999 };

        BinarySearch search = new BinarySearch();
        assertTrue(search.doesValueExist(inputArray, 9));
    }
}