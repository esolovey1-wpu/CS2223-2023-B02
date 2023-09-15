package edu.wpi.cs2223.week1;

/**
 * Implements the binary search algorithm against a sorted array of integers.
 */
public class BinarySearch {
    /**
     * @return true iff the target value exists in sortedArray
     */
    public boolean doesValueExist(int[] sortedArray, int target) {
        int loopIterations = 0;

        // empty arrays contain no targets
        if (sortedArray.length == 0) {
            return returnWithLog(false, loopIterations, sortedArray.length);
        }

        int lowerRange = 0;
        int upperRange = sortedArray.length - 1;

        while (lowerRange <= upperRange) {
            loopIterations++;

            int midpoint = (upperRange + lowerRange) / 2;
            int valueAtMidPoint = sortedArray[midpoint];

            if (target == valueAtMidPoint) {
                return returnWithLog(true, loopIterations, sortedArray.length);
            }

            // narrow range to either left or right half based on comparison to midpoint
            if (target > valueAtMidPoint) {
                lowerRange = midpoint + 1;
            } else {
                upperRange = midpoint - 1;
            }
        }
        return returnWithLog(false, loopIterations, sortedArray.length);
    }

    boolean returnWithLog(boolean returnValue, int loopIterations, int inputArrayLengths) {
        System.out.printf("Returning %b after %d iterations for an array of size %d\n", returnValue, loopIterations, inputArrayLengths);
        return returnValue;
    }
}
