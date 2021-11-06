package com.technext.patterns;

/** The Two Pointer Technique ideally runs
 * in a linear environment. */
public class TwoPointerTechnique {
  /** Two Sum is a famous LeetCode question. This approach
   * returns the two indexes that match a target given
   * a sorted array.
   *
   * @param arr a sorted array of integers
   * @param target the integer target we are trying to find
   * @return an array of integers of the indexes that add up to the target */
  public int[] twoSum(final int[] arr, final int target) {
    int leftPointer = 0;
    int rightPointer = arr.length - 1;
    while (leftPointer < rightPointer) {
      int curr = arr[leftPointer] + arr[rightPointer];
      if (curr < target) {
        leftPointer += 1;
      } else if (curr > target) {
        rightPointer -= 1;
      } else {
        return new int[]{leftPointer, rightPointer};
      }
    }
    return new int[]{-1, -1};
  }
}
