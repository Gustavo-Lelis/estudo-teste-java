package gus.study.calculatorTest.modelTest;

import gus.study.model.Add;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTest {
    @Test

    public void AddTwoNumberPositiveTest(){
        Add som = new Add();

        double resultAdd = som.execute(1,2);

        assertEquals(3,resultAdd, 0.0001);
    }
}
