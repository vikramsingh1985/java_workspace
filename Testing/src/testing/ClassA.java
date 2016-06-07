package testing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassA {
	public static void dispaly(){
		System.out.println("super class method ");
	}
	
	public void print(){
		System.out.println("print method of class A:");
	}
	public void print(String str){
		Pattern p = Pattern.compile("-?\\+d");
		Matcher matcher = p.matcher(str); 
		
		for(int i=0;i<str.length();i++){
			System.out.println(matcher.group(i));
		}
		
	}

}
