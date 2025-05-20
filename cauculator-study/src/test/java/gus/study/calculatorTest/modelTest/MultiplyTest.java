package gus.study.calculatorTest.modelTest;

import gus.study.model.Multiply;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {

    @Test
    public void multiplyPositiveNumberWithNegativeNumberTest() {
        Multiply mult = new Multiply();

        double resultMultiply = mult.execute(2,-10);

        assertEquals(-20, resultMultiply,0.0001);
    }
}
