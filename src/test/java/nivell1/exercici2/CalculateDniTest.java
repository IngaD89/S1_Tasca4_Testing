package nivell1.exercici2;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.nivell1.exercici2.CalculateDNI;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;



public class CalculateDniTest {

     static Stream<Arguments> provideData(){
        return Stream.of(
                Arguments.of(12345678, 'Z'),
                Arguments.of(78901234, 'X'),
                Arguments.of(45678901, 'G'),
                Arguments.of(34567890, 'V'),
                Arguments.of(89012345, 'E'),
                Arguments.of(67890123, 'B')
        );
    }


    @ParameterizedTest
    @MethodSource("provideData")
    public void calculateDni(int dniNum, char character){
        CalculateDNI calculateDNI = new CalculateDNI();
        assertEquals(character, calculateDNI.CalculateDniLetter(dniNum));
    }
}
