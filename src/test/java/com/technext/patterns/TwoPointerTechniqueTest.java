package com.technext.patterns;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TwoPointerTechniqueTest {

  TwoPointerTechnique twoPointerTechnique;

  public void setUp() {
    twoPointerTechnique = new TwoPointerTechnique();
  }

  @Test
  public void twoSum() {
    int[] arrAddsUp = new int[]{2, 7, 11, 15};
    int addsUpTarget = 9;
    int[] expectedAddsUp = new int[]{0, 1};
    assertArrayEquals(expectedAddsUp, twoPointerTechnique.twoSum(arrAddsUp, addsUpTarget));
  }

  @Test
  public void twoSumImpossibleTarget() {    int[] doesNotAddUpArr = new int[]{2, 7, 11, 15};
    int doesNotAddUpTarget = 40;
    int[] expectedDoesNotAddUpArr = new int[]{-1, -1};
    assertArrayEquals(expectedDoesNotAddUpArr, twoPointerTechnique.twoSum(doesNotAddUpArr, doesNotAddUpTarget));
  }
}
