package org.ali.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data @AllArgsConstructor
public class Employee implements Comparable<Employee>{
	private int age;
	private String name;
	@Override
	public int compareTo(Employee e1) {
		return Integer.valueOf(this.age).compareTo(e1.age);
	}
	
}