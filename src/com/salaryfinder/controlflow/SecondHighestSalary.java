package com.salaryfinder.controlflow;

public class SecondHighestSalary {

	public static void main(String[] args) {
		int[] salaries = { 700, 850, 650, 1200, 900 };
		System.out.println("Second Highest Salary: " + findSecondHighestSalary(salaries));
	}

	public static int findSecondHighestSalary(int[] salaries) {
		if (salaries == null || salaries.length < 2) {
			throw new IllegalArgumentException("Array must contain at least two elements.");
		}

		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int salary : salaries) {
			if (salary > highest) {
				secondHighest = highest;
				highest = salary;
			} else if (salary > secondHighest && salary != highest) {
				secondHighest = salary;
			}
		}

		return secondHighest;
	}
}