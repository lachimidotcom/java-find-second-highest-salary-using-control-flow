package com.salaryfinder.controlflow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecondHighestSalaryTest {

	@Test
    public void testFindSecondLargestSalary() {
        int[] salaries = {70000, 85000, 65000, 120000, 90000};
        assertEquals(90000, SecondHighestSalary.findSecondHighestSalary(salaries));
    }
    
    @Test
    public void testFindSecondLargestSalaryWithInvalidArray() {
        int[] salaries = {70000};
        assertThrows(IllegalArgumentException.class, () -> {
        	SecondHighestSalary.findSecondHighestSalary(salaries);
        });
    }
    
    @Test
    public void testFindSecondLargestSalaryWithDuplicates() {
        int[] salaries = {70000, 85000, 85000, 120000, 120000};
        assertEquals(85000, SecondHighestSalary.findSecondHighestSalary(salaries));
    }
    
    @Test
    public void testFindSecondLargestSalaryWithNegatives() {
        int[] salaries = {-200, -500, -150, -50};
        assertEquals(-150, SecondHighestSalary.findSecondHighestSalary(salaries));
    }

}
