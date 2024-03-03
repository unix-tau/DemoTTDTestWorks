import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestDemo {

    @BeforeClass
    public static void setUp() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("After class1");
    }

    @AfterClass
    public static void tearDown1() {
        System.out.println("After class2");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }
}
