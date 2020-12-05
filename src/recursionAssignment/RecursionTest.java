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
      assertEquals(1, Recursion.count7(127));

    }
    @Test
    public void Test1_2(){
      assertEquals(2, Recursion.count7(717));

    }
    @Test
    public void Test1_3(){
      assertEquals(0, Recursion.count7(123));

    }
    
}

