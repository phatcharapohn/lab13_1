import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class test {


    @Test
    public void testNegativeInput() {
        assertEquals(9, main.calculateSumOfDigits(12345));
        
    }
    @Test
    public void testCalculateSumOfDigits() {
        assertEquals(9, SumOfDigits.calculateSumOfDigits(12345));
        assertEquals(6, SumOfDigits.calculateSumOfDigits(123));
        assertEquals(7, SumOfDigits.calculateSumOfDigits(2323));
        assertEquals(0, SumOfDigits.calculateSumOfDigits(0)); 
        assertEquals(1, SumOfDigits.calculateSumOfDigits(10)); 
        assertEquals(3, SumOfDigits.calculateSumOfDigits(111111)); 
        assertEquals(8, SumOfDigits.calculateSumOfDigits(89)); 
    }
}
