package org.tomar;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class TestSet {
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		
		students.add(new Student("john", 22));
		students.add(new Student("janny", 22));
		students.add(new Student("john", 22));
		students.add(new Student("john", 22));
		students.add(new Student("john", 22));
		students.add(new Student("john", 22));
		
		System.out.println(students);
	}
}

@Getter @Setter @AllArgsConstructor @ToString
class Student {
	private String name;
	private int age;
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		return this.name.equals(s.name);
	}
}
