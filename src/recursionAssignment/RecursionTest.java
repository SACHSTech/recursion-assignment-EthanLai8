package recursionAssignment; 

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest {

    // Tests for Problem set 1
    @Test
    public void Test1_1(){

      // Tests if there are 2 sevens in the integer. Expects a result of 2. 
      assertEquals(2, Recursion.count7(717));
    }
    @Test
    public void Test1_2(){

      // Tests if there are 4 sevens in the integer. Expects a result of 4. 
      assertEquals(4, Recursion.count7(7273717));
    }
    @Test
    public void Test1_3(){

      // Tests if there are no sevens in the integer. Expects a result of 0. 
      assertEquals(0, Recursion.count7(123));
    }
    @Test
    public void Test1_4(){

      // Tests if there is a seven in the integer. Expects a result of 1. 
      assertEquals(1, Recursion.count7(7));
    }
    @Test
    public void Test1_5(){

      // Tests if there are 3 sevens in the integer. Expects a result of 3. 
      assertEquals(3, Recursion.count7(777));
    }

    // Tests for Problem set 2
    @Test
    public void Test2_1(){

      // Tests with a string of "xpix". Expects a result of "x3.14x". 
      assertEquals("x3.14x", Recursion.changePi("xpix"));
    }
    @Test
    public void Test2_2(){

      // Tests with a string of "pipi". Expects a result of "3.143.14". 
      assertEquals("3.143.14", Recursion.changePi("pipi"));
    }
    @Test
    public void Test2_3(){

      // Tests with a string of "pip". Expects a result of "3.14p". 
      assertEquals("3.14p", Recursion.changePi("pip"));
    }
    @Test
    public void Test2_4(){

      // Tests with a string of "pppzpp". Expects a result of "pppzpp". 
      assertEquals("pppzpp", Recursion.changePi("pppzpp"));
    }
    @Test
    public void Test2_5(){

      // Tests with a string of "ppippi". Expects a result of "p3.14p3.14". 
      assertEquals("p3.14p3.14", Recursion.changePi("ppippi"));
    }

    // Tests for Problem set 3
    @Test
    public void Test3_1(){

      // Tests with an array of {1, 2, 20}. Expects true. 
      assertTrue(Recursion.array220(new int[] {1, 2, 20}, 0));
    }
    @Test
    public void Test3_2(){

      // Tests with an array of {3, 30}. Expects true. 
      assertTrue(Recursion.array220(new int[] {3, 30}, 0));
    }
    @Test
    public void Test3_3(){

      // Tests with an array of {3}. Expects false. 
      assertFalse(Recursion.array220(new int[] {3}, 0));
    }
    @Test
    public void Test3_4(){

      // Tests with an array of {2,3,4,5}. Expects false. 
      assertFalse(Recursion.array220(new int[] {2,3,4,5}, 0));
    }
    @Test
    public void Test3_5(){

      // Tests with an array of {9,20,2,5}. Expects false. 
      assertFalse(Recursion.array220(new int[] {9,20,2,5}, 0));
    }
}

