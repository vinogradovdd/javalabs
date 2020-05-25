package mylabs.mylab7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MyConcurrentPiCalculatorTest {

    @Test
    void testConcurrentlyCalculatePi() throws Exception {
        MyConcurrentPiCalculator myConcurrentPiCalculator = new MyConcurrentPiCalculator();
        double calculatedPi = myConcurrentPiCalculator.concurrentlyCalculatePi(4, 250000000);
        assertTrue(String.valueOf(calculatedPi).startsWith("3.14"));
    }
}
