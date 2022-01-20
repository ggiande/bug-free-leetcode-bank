package com.technext.patterns;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class SlidingWindowTest extends TestCase {

  SlidingWindow slidingWindow;

  public void setUp() throws Exception {
    super.setUp();
    slidingWindow = new SlidingWindow();
  }

  public void testSlidingWindowMaxSum() {
    int[] input = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
    int k = 3;
//    int[] input = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
    int expectedOutput = 16;
    assertEquals(expectedOutput, slidingWindow.slidingWindowMaxSum(input));
  }



  public void tearDown() throws Exception {

  }
}