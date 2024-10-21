package nivell1.exercici3;

import org.example.nivell1.exercici3.ExceptionArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionArrayTest {

    private ExceptionArray exceptionArray = new ExceptionArray();


    @Test
    public void assertThrowsException() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            exceptionArray.noSuchIndex(5);
        });
    }

}
