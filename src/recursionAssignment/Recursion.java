package recursionAssignment;

import java.io.*;

public class Recursion{

/* 
* Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). 
* @param n = the test integer.
* @return the number of 7s in the integer
* @author E.Lai
*/

  public static int count7(int n) {

    // Base case. If n ever reaches 0, stops the recursion.
    if (n == 0) {
      return 0;
    
    // Recursive call. If the ones digit is a 7, adds 1 to the count. Then repeats the method on the number without the ones digit.
    } else if (n % 10 == 7) {
      return 1 + count7(n / 10);
    }

    // Recursive call. If there is no 7 in the ones digit, repeats the method on the number without the ones digit.
    return count7(n / 10);
  }

/* 
* Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
* @param n = the test integer.
* @return the number of 7s in the integer
* @author E.Lai
*/

  public static String changePi(String str) {
    if (str.length() == 0) {
      return "";
    }
    return str.substring(0) + changePi(str.substring(1));
  }
}
