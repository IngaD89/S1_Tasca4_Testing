package nivell2.exercici4;

import org.example.nivell2.exercici4.Employee;
import org.example.nivell2.exercici4.HR;
import org.example.nivell2.exercici4.Programmer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeTest {
    ArrayList<Employee> employees = new ArrayList<>();
    HR hr = new HR("Inga");
    HR hr1 = new HR("Inga1");
    Programmer programmer = new Programmer("Deme");
    Programmer programmer2 = new Programmer("Deme2");



    @Test
    public void verifyEmployeeUnorderedList(){
        employees.add(hr);
        employees.add(hr1);
        employees.add(programmer);
        employees.add(programmer2);

        Collections.shuffle(employees);

        assertThat(employees).contains(hr, hr1, programmer, programmer2);
    }

    @Test
    public void verifyObjectAddsOnlyOnce(){

        employees.add(hr);
        employees.add(hr1);
        employees.add(programmer);
        employees.add(programmer2);

        assertThat(employees).containsOnlyOnce(hr);
    }

    @Test
    public void verifyDoesNotContains(){
        employees.add(hr);
        employees.add(hr1);
        employees.add(programmer);

        assertThat(employees).doesNotContain(programmer2);
    }
}
