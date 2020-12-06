package recursionAssignment; 

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest {

    // Tests for Problem set 1
    @Test
    public void Test1_1(){
      assertEquals(2, Recursion.count7(717));
    }
    @Test
    public void Test1_2(){
      assertEquals(4, Recursion.count7(7273717));
    }
    @Test
    public void Test1_3(){
      assertEquals(0, Recursion.count7(123));
    }
    @Test
    public void Test1_4(){
      assertEquals(1, Recursion.count7(7));
    }
    @Test
    public void Test1_5(){
      assertEquals(3, Recursion.count7(777));
    }

    // Tests for Problem set 2
    @Test
    public void Test2_1(){
      assertEquals("x3.14x", Recursion.changePi("xpix"));
    }
    @Test
    public void Test2_2(){
      assertEquals("3.143.14", Recursion.changePi("pipi"));
    }
    @Test
    public void Test2_3(){
      assertEquals("3.14p", Recursion.changePi("pip"));
    }
    @Test
    public void Test2_4(){
      assertEquals("pppzpp", Recursion.changePi("pppzpp"));
    }
    @Test
    public void Test2_5(){
      assertEquals("p3.14p3.14", Recursion.changePi("ppippi"));
    }

    // Tests for Problem set 3
    @Test
    public void Test3_1(){
      assertTrue(Recursion.array220(new int[] {1, 2, 20}, 0));
    }
    @Test
    public void Test3_2(){
      assertTrue(Recursion.array220(new int[] {3, 30}, 0));
    }
    @Test
    public void Test3_3(){
      assertFalse(Recursion.array220(new int[] {3}, 0));
    }
    @Test
    public void Test3_4(){
      assertFalse(Recursion.array220(new int[] {2,3,4,5}, 0));
    }
    @Test
    public void Test3_5(){
      assertFalse(Recursion.array220(new int[] {9,20,2,5}, 0));
    }
}

