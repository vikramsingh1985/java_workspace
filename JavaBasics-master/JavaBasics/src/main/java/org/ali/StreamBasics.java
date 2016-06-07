package org.ali;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.ali.model.Employee;

/**
 * Hello world!
 *
 */
public class StreamBasics{
    public static void main( String[] args ) {
        List<Employee> employees = Arrays.asList(
        		new Employee(26, "chris"),
        		new Employee(24, "john"),
        		new Employee(53, "jane"),
        		new Employee(35, "penny"),
        		new Employee(20, "beckham")
        );
        
        Stream<String> streamNames = employees.stream().filter((emp)->{
        	return emp.getAge()>25;
        }).map((emp)->{return emp.getName();}).map((name) -> name.toUpperCase());
        
        
        System.out.println(streamNames.collect(Collectors.toList()));
    }
   
}
