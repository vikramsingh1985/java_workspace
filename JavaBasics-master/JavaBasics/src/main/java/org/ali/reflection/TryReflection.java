package org.ali.reflection;

import java.lang.reflect.Field;
import org.ali.model.UserProfile;

public class TryReflection {
	
	 public static void main(String[] args) {
	        inspect(UserProfile.class);
	    }
	 	 
	    static <T> void inspect(Class<T> klazz) {
	        Field[] fields = klazz.getDeclaredFields();
	        System.out.printf("%d fields:%n", fields.length);
	        for (Field field : fields) {
	           System.out.println("Field Name : " + field.getName());
	        }
	    }
	

}
