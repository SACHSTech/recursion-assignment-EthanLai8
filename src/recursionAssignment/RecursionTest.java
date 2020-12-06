/*package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.After;

import recursionAssignment.Recursion;

public class RecursionTest{ */
    
    /* @Before
    public void beforeTest(){
      // some steps to perform before tests are run
    }
    
    /**
     * An initial test
     */
    /* @Test
    public void Test1(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(1, Recursion.count7(127));
    }
    
    // add more tests
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
} */

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
}

