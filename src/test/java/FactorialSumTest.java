import com.tau.FactorialSum;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class FactorialSumTest {

    static int n,result ;
    @Test
    public void testFactorial() {
        assertTrue(result == 120);
        System.out.println("Factorial: " + result);

    }


    @Test
    public void testFactorial2() {
        int n = 6;
        int result = FactorialSum.factorial(n);
        assertEquals(720, result);
        System.out.println("Factorial: " + result);
    }

    @BeforeClass
    public static void setUp() {
         n = 5;
        result = FactorialSum.factorial(n);
        System.out.println("Before class\n");
    }

    @AfterClass
    public  static  void  tearDown(){
        System.out.println("\ntest completed");
    }
}
