package org.ali;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.ali.model.Employee;

public class SortingBasics {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(1, "jack"));
		employees.add(new Employee(9, "jane"));
		employees.add(new Employee(3, "john"));
		employees.add(new Employee(7, "justin"));
		employees.add(new Employee(2, "jonny"));
		employees.add(new Employee(6, "joe"));
		Collections.sort(employees);
		System.out.println(employees);
		
	}
}
