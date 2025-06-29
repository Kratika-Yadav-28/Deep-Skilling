import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    // Setup - runs before every test
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup done ✅");
    }

    // Teardown - runs after every test
    @After
    public void tearDown() {
        System.out.println("Teardown done 🧹");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 2;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {
        // Arrange
        int a = 4;
        int b = 5;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(20, result);
    }
}
