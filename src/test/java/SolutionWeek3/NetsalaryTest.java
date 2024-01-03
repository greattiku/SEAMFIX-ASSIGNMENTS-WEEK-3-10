package SolutionWeek3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NetsalaryTest {
    @Test
    void salary(){

        Netsalary nt = new Netsalary();
        nt.Salary();
        assertTrue(nt.Salary()==25560);
    }

}