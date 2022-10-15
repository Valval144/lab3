import static org.junit.Assert.*;
import org.junit.*;


public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  //messed up at 3rd index
  @Test 
	public void reverseLong() {
    int[] input1 = { 3,4,9,10 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 10,9,4,3 }, input1);
	}
  //not reversing at all
  @Test 
	public void reversingTwo() {
    int[] input1 = {2,1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1,2 }, input1);
	}
  //reversing negative numbers
  @Test 
	public void reversingNegatives() {
    int[] input1 = {-1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ -1 }, input1);
	}
  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  //first tester 
  @Test
  public void reverseArray() {
    int[] input1 = { 1,2,3 };
    assertArrayEquals(new int[]{3,2,1 }, ArrayExamples.reversed(input1));
  }
  //averageWithoutLowest
  @Test 
  public void averageTester() {
    double[] average = {1,2,4};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(average), 0.01);
  }

  @Test 
public void averageDuplicates() {
    double[] average = {1,1,3};
    assertEquals(2, ArrayExamples.averageWithoutLowest(average), 0.01);
  }

  @Test 
  public void averageNums() {
      double[] average = {0,2,3,4,1,5};
      assertEquals(3.0, ArrayExamples.averageWithoutLowest(average), 0.01);
    }

}
