package nivell3;


import org.example.nivell3.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void verifyAddOperation(){

        assertEquals(8, calculator.addition(3,5));
    }

    @Test
    public void verifySubtraction(){
        assertEquals(3, calculator.subtraction(8, 5));
    }

    @Test
    public void verifyMultiplication(){
        assertEquals(15, calculator.multiplication(3,5));
    }

    @Test
    public void verifyDivision(){
        assertEquals(3, calculator.division(15,5));
    }

    @Test
    public void verifyDivisionByZero(){
        assertThrows(ArithmeticException.class, () -> {
            calculator.division(5, 0);
        });
    }

}
