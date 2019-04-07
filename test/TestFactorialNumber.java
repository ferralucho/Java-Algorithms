
import factorialnumber.FactorialNumber;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestFactorialNumber {
    @Test
    public void testFactorialNumber(){
        FactorialNumber f = new FactorialNumber();
        int result = f.getFactorial(4);
        assertEquals(24, result);
    }
}
