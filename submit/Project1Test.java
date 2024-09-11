import org.junit.*;
import static org.junit.Assert.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.*;


public class Project1Test 
{

    private CollectionUtilities<Integer> runner;
    /**
     * runner - known as the "test runner" object, this is the
     * object that you will use in testing. You will use this
     * object in each of your tests after reinitializing (new)
     * in the setup() method below.
     * 
     * For example, if you want to test it with Strings,
     * create an instance like this:
     * 
     *  private CollectionUtilities<String> runner;
     */

    /**
     * setup() method, runs before each test method below.
     * Use this method to recreate the objects needed for
     * testing your class.
     */
    @Before
    public void setup()
    {
        ArrayList<Integer> testNums = new ArrayList<Integer>();
        testNums.add(34567);
        testNums.add(2839);
        testNums.add(4567);
        testNums.add(98765);
        testNums.add(87);
        testNums.add(9);
        testNums.add(9);
        testNums.add(2);
        testNums.add(12345678);
        testNums.add(98);

        runner = new Project1<Integer>(testNums);

    }

    /**
     * Tests the method findSmallest().
     */
    @Test
    public void testingFindSmallest()
    {
        int smallest = runner.findSmallest();
        assertEquals(2, smallest);
    }

    /**
     * Tests the method findLargest().
     */
    @Test
    public void testingFindLargest()
    {
        int largest = runner.findLargest();
        assertEquals(12345678, largest);
    }

    /**
     * Tests the method hasDuplicates().
     */
    @Test
    public void testingHasDuplicates()
    {
        boolean hasDuplicate = runner.hasDuplicates();
        assertTrue(hasDuplicate);
    }

    /**
     * Tests the method findOneThat().
     */
    @Test
    public void testingFindOneThat()
    {
        Predicate<Integer> p = i -> i < 10;
        Project1<Integer> specialRunner = (Project1<Integer>) runner;

        int item = specialRunner.findOneThat(p);

        assertEquals(9, item);
    }
    
    /**
     * Tests the method filterList().
     */
    @Test
    public void testingFilterList()
    {
        Predicate<Integer> p = i -> i % 2 == 0;


        Project1<Integer> specialRunner = (Project1<Integer>) runner;

        AbstractList<Integer> item = specialRunner.filterList(p);

        ArrayList<Integer> testNums = new ArrayList<Integer>();
        testNums.add(2);
        testNums.add(12345678);
        testNums.add(98);

        assertEquals(testNums, item);
    }

    
}
