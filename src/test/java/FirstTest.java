import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FirstTest {

    // кратно 3, возвращать 'I'
    // кратно 5, возвращать 'F'
    // кратно 3 и 5, возвращать 'А'
    // возвращать 'T'

    public String trialCode(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "A";
        } else if (number % 3 == 0) {
            return "I";
        } else if (number % 5 == 0) {
            return "F";
        } else {
            return "T";
        }
    }

    @Test
    public void checkIfMultipleOf3() {
        String actualResult = trialCode(9);
        assertEquals(actualResult, "I", "Expected different value");
    }

    @Test
    public void checkIfMultipleOf5() {
        String actualResult = trialCode(10);
        assertEquals(actualResult, "F", "Expected different value");
    }

    @Test
    public void checkIfMultipleOf3And5() {
        String actualResult = trialCode(15);
        assertEquals(actualResult, "A", "Expected different value");
    }

    @Test
    public void checkIfOtherNumber() {
        String actualResult = trialCode(7);
        assertEquals(actualResult, "T", "Expected different value");
    }
}
