package gus.study.calculatorTest.serviceTest;

import gus.study.service.Operation;
import gus.study.service.OperationService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class OperationServiceTest {

    @Test
    public void resultDivideTest(){
        OperationService service = new OperationService();

        ArithmeticException aex = assertThrows(ArithmeticException.class, () ->
        {service.executeOperation(Operation.DIVIDE, 1, 0);
        });

        assertEquals("denominator equal to zero", aex.getMessage());

    }

}
