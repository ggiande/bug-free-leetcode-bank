package com.technext.solutions;

import java.util.HashMap;

/** 1. Two Sum - Easy.
 *
 * @author giancarlogarciadeleon
 * <p> Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.</p>
 */
public class TwoSum {

  /** Two Sum solution given an unordered array.
   *
   * @param nums array of unordered integers
   * @param target sum of two integers
   * @return an array of integers containing the indexes of the solution */
  public int[] twoSum(final int[] nums, final int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    // map <currValue == difference, index>
    for (int i = 0; i < nums.length; i++) {
      int currValue = nums[i];
      int difference = target - currValue;

      if (map.containsKey(difference)) {
        return new int[]{map.get(difference), i};
      }
      map.put(currValue, i);
    }
    return null;
  }
}
