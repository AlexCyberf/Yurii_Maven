import org.example.Main;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testCalculateFactorialZero() {
        assertEquals(1, Main.calculateFactorial(0));
    }

    @Test
    public void testCalculateFactorialPositive() {
        assertEquals(120, Main.calculateFactorial(5));
    }

    @Test
    public void testIsPrimeForPrimeNumber() {
        assertTrue(Main.isPrime(13));
    }

    @Test
    public void testIsPrimeForNonPrimeNumber() {
        assertFalse(Main.isPrime(9));
    }

    @Test
    public void testCalculateSumOfPrimes() {
        assertEquals(17, Main.calculateSumOfPrimes(10));
    }
}
