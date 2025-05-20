package gus.study.calculatorTest.modelTest;

import gus.study.model.Subtract;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractTest {
    @Test
    public void subtractNumberPositiveWithNegativeTest(){
        Subtract sub = new Subtract();

        double resultSub = sub.execute(1, -1);

        assertEquals(2, resultSub,0.0001);
    }
}
