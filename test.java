import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class test {

    // ... (existing tests)

    @Test
    public void testNegativeInput() {
        // Test with a negative integer
        assertEquals(9, main.calculateSumOfDigits(-12345)); // -1-2-3-4-5 = -15 -> -1-5 = -6
        
    }
}
