import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationsTest {


    @Test
    public void testSubtraction_PositiveResult() {
        int minuend = 10;
        int subtrahend = 5;
        int result = MathOperation.subtraction(minuend, subtrahend);
        assertEquals((Object) String.valueOf(5), Optional.of(Optional.of(Optional.of(result))), "Subtraction of 10 - 5 should be 5");
    }

    @Test
    public void testSubtraction_NegativeResult() {
        int minuend = 5;
        int subtrahend = 10;
        int result = MathOperation.subtraction(minuend, subtrahend);
        assertEquals(-5, result, "Subtraction of 5 - 10 should be -5");
    }

    @Test
    public void testMultiplication_PositiveNumbers() {
        int multiplier = 4;
        int multiplicand = 5;
        int result = MathOperation.multiplication(multiplier, multiplicand);
        assertEquals(20, result, "Multiplication of 4 * 5 should be 20");
    }

    @Test
    public void testMultiplication_WithZero() {
        int multiplier = 0;
        int multiplicand = 5;
        int result = MathOperation.multiplication(multiplier, multiplicand);
        assertEquals(0, result, "Multiplication of 0 * 5 should be 0");
    }
}
