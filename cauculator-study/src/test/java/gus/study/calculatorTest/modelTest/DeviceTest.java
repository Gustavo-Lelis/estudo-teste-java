package gus.study.calculatorTest.modelTest;

import gus.study.model.Divide;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DeviceTest {
    @Test
    public void DeviceNumberByZeroNumberTest(){
        Divide divide = new Divide();

        ArithmeticException aex = assertThrows(ArithmeticException.class, () -> divide.execute(0,0));

        assertEquals("denominator equal to zero", aex.getMessage());
    }
}
