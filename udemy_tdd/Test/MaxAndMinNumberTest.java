import MaxAndMinNumer.MaxAndMinNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxAndMinNumberTest {

    MaxAndMinNumber maxAndMinNumber;
    @Before
    public void setUp() throws Exception {
        maxAndMinNumber = new MaxAndMinNumber();
    }

    private int[] nums(int ... num) {
        return num;
    }

    private void assertNums(int max, int min) {
        assertEquals(max, maxAndMinNumber.getMax());
        assertEquals(min, maxAndMinNumber.getMin());
    }

    @Test
    public void testOnlyOneNumber() throws Exception {
        maxAndMinNumber.find(nums(1));
        assertNums(1,1);
    }

    @Test
    public void testAnyOrder() throws Exception {
        maxAndMinNumber.find(nums(1, 2, 8, 9, 3));
        assertNums(9,1);
    }

    @Test
    public void testRepeatNumber() throws Exception {
        maxAndMinNumber.find(nums(1, 1, 1));
        assertNums(1,1);
    }

    @Test
    public void testIncreasingNumber() throws Exception {
        maxAndMinNumber.find(nums(1, 2, 3));
        assertNums(3,1);
    }

    @Test
    public void testDecreasingNumber() throws Exception {
        maxAndMinNumber.find(nums(3, 2, 1));
        assertNums(3,1);
    }

    @Test
    public void testEmptyNumber() throws Exception {
        maxAndMinNumber.find(nums());
        assertNums(0,0);    }
}