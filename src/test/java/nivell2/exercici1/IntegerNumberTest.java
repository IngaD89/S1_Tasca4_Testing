package nivell2.exercici1;


import org.example.nivell2.exercici1.IntegerNumber;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegerNumberTest {

    @Test
    public void assertNumbersAreEqual(){

        int num1 = new IntegerNumber(100).getNumber();
        int num2 = new IntegerNumber(100).getNumber();

        assertThat(num1).isEqualTo(num2);
    }

    @Test
    public void assertNumbersDoesNotEqual(){
        assertThat(new IntegerNumber(100)).isNotEqualTo(new IntegerNumber(200));
    }
}
