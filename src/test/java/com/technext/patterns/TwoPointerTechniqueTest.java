package com.technext.patterns;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TwoPointerTechniqueTest extends TestCase {

  TwoPointerTechnique twoPointerTechnique;

  @Test
  public void twoSum() {
    twoPointerTechnique = new TwoPointerTechnique();
    int[] arrAddsUp = new int[]{2, 7, 11, 15};
    int addsUpTarget = 9;
    int[] expectedAddsUp = new int[]{0, 1};
    assertArrayEquals(expectedAddsUp, twoPointerTechnique.twoSum(arrAddsUp, addsUpTarget));
  }

  @Test
  public void twoSumImpossibleTarget() {
    twoPointerTechnique = new TwoPointerTechnique();
    int[] doesNotAddUpArr = new int[]{2, 7, 11, 15};
    int doesNotAddUpTarget = 40;
    int[] expectedDoesNotAddUpArr = new int[]{-1, -1};
    assertArrayEquals(expectedDoesNotAddUpArr, twoPointerTechnique.twoSum(doesNotAddUpArr, doesNotAddUpTarget));
  }
}
