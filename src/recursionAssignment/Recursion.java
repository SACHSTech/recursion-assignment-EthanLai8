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
* @param str = the Test string
* @return a new string with the letters "pi" replaced with "3.14"
* @author E.Lai
*/

  public static String changePi(String str) {

    // Base case. Since the recursive call calls 2 characters, the base case must detect 1 or less characters other wise the recursive call will call out of the string. Stops the recursion when there are only 1 or less characters left in the string.
    if (str.length() <= 1) {
      return str;

    // Recursive call. If the first 2 characters of the string is "pi", then it changes those characters into "3.14". Afterwards, repeats the method on the rest of the string.
    } else if (str.substring(0,2).equals("pi")) {
      return "3.14" + changePi(str.substring(2));
    }
    // Recursive call. If the first 2 characters are not "pi", skips over the first character and repeats the method on the rest of the string.
    return str.substring(0,1) + changePi(str.substring(1));
  }

/* 
* Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
* @param intNums = the test array. 
* @param index = the index of the array. It starts as a 0.
* @return boolean that is true if there is a number that is a multiple of 10 by the previous number.
* @author E.Lai
*/

  public static boolean array220(int[] intNums, int index) {

    // Base case. If the index of the array is ever greater than or equal to the length of the entire array, returns false and stops the recursion.
    if (index >= intNums.length - 1) {
      return false;
    
    // If the current index has a number after it that is 10 times greater than the current index, returns true and stops the recursion.
    } else if (intNums[index] * 10 == intNums[index + 1]) {
      return true;
    }

    // Recursive call. If no boolean value has been returned, returns the entire array but increases the index by 1 each time. Therefore, this line iterates through the array after each recursion.
    return array220(intNums, index + 1);
  }
}
