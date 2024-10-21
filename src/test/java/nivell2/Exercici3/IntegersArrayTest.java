package nivell2.Exercici3;

import org.example.nivell2.exercici3.IntegersArray;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegersArrayTest {

    @Test
    public void assertArraysAreIdentical(){
        int[] numbers1 = new IntegersArray(new int[]{1, 2, 3}).getNumbers();
        int[] numbers2 = new IntegersArray(new int[]{1, 2, 3}).getNumbers();

        assertThat(numbers1).containsExactly(numbers2);
    }
}
