package recursionAssignment;

import java.io.*;

public class Recursion{
  public static void main(String[] args){
    System.out.println(count7(123));
  }
/* 
* Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). 
* @param n = the test integer.
* @return the number of 7s in the integer
* @author E.Lai
*/

  public static int count7(int n) {
    if(n == 0){
      return 0;
    }
    return n;
  }
}
