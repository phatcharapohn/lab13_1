import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class test {

    // ... (existing tests)

    @Test
    public void testNegativeInput() {
        // Test with a negative integer
        assertEquals(9, main.calculateSumOfDigits(-12345)); // -1-2-3-4-5 = -15 -> -1-5 = -6
        
    }
    @Test
    public void testCalculateSumOfDigits() {
        // Test cases for calculateSumOfDigits method
        assertEquals(9, SumOfDigits.calculateSumOfDigits(12345));
        assertEquals(6, SumOfDigits.calculateSumOfDigits(123));
        assertEquals(7, SumOfDigits.calculateSumOfDigits(2323));
        assertEquals(0, SumOfDigits.calculateSumOfDigits(0)); // Test with a single-digit number
        assertEquals(1, SumOfDigits.calculateSumOfDigits(10)); // Test with 10
        assertEquals(3, SumOfDigits.calculateSumOfDigits(111111)); // Test with all same digits
        assertEquals(8, SumOfDigits.calculateSumOfDigits(89)); // Test with two different digits
        // Add more test cases as needed
    }
}
