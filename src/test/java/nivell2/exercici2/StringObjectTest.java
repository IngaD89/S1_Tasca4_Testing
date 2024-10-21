package nivell2.exercici2;


import org.example.nivell2.exercici2.StringObject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringObjectTest {

    @Test
    public void assertObjectsAreSame(){
        StringObject stringObject = new StringObject("obj");
        StringObject stringObject1 = stringObject;
        assertThat(stringObject).isSameAs(stringObject1);
    }

    @Test
    public void assertObjectsAreDifferent(){
        StringObject stringObject = new StringObject("obj");
        StringObject stringObject1 = new StringObject("obj");
        assertThat(stringObject).isNotSameAs(stringObject1);
    }
}
