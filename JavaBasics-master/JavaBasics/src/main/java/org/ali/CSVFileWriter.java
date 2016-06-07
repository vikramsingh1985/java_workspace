package org.ali;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.ali.model.Student;
import org.ali.model.UserProfile;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class CSVFileWriter {

	
		//Delimiter used in CSV file
		    private static final String NEW_LINE_SEPARATOR = "\n";
		    //CSV file header
		    private static final Object [] FILE_HEADER = {"fullname","email","orgName","phone","gender","country"};
		    public static void writeCsvFile(String fileName) {
		         
		        /*//Create new students objects
		        Student student1 = new Student(1, "Ahmed", "wigzo", "M", 25);
		        Student student2 = new Student(2, "Sara", "Said", "F", 23);
		        Student student3 = new Student(3, "Ali", "Hassan", "M", 24);
		        Student student4 = new Student(4, "Sama", "Karim", "F", 20);
		        Student student5 = new Student(5, "Khaled", "Mohamed", "M", 22);
		        Student student6 = new Student(6, "Ghada", "Sarhan", "F", 21);

		        //Create a new list of student objects
		        List<Student> students = new ArrayList<>();
		        students.add(student1);
		        students.add(student2);
		        students.add(student3);
		        students.add(student4);
		        students.add(student5);
		        students.add(student6);*/
		    	UserProfile userProfile = new UserProfile("Ahmed", null, "wigzo", "999988887", "M", 0l, "In");
		    	
		        FileWriter fileWriter = null;
		        CSVPrinter csvFilePrinter = null;
		        //Create the CSVFormat object with "\n" as a record delimiter
		        CSVFormat csvFileFormat = CSVFormat.DEFAULT.withRecordSeparator(NEW_LINE_SEPARATOR);
		        try {
		            //initialize FileWriter object
		            fileWriter = new FileWriter(fileName);
		            //initialize CSVPrinter object
		            csvFilePrinter = new CSVPrinter(fileWriter, csvFileFormat);
		            //Create CSV file header
		            csvFilePrinter.printRecord(FILE_HEADER);
		            
		            long i = 0;
		            /*for(i = 0; i < 100000 ; i++){
		            	student1.setLastName("a"+i);
		            	List<String> studentDataRecord = new ArrayList();
		                studentDataRecord.add(student1.getFirstName());
		                studentDataRecord.add(student1.getLastName());
		                studentDataRecord.add(student1.getGender());
		                csvFilePrinter.printRecord(studentDataRecord);
		            }*/
		            for(i = 0; i < 1000000 ; i++){
		            	userProfile.setEmail("a"+i);
		            	List<String> userProfileRecord = new ArrayList();
		            	userProfileRecord.add(userProfile.getFullName());
		            	userProfileRecord.add(userProfile.getEmail());
		            	userProfileRecord.add(userProfile.getOrgName());
		            	userProfileRecord.add(userProfile.getPhone());
		            	userProfileRecord.add(userProfile.getGender());
		            	userProfileRecord.add(userProfile.getCountry());
		                csvFilePrinter.printRecord(userProfileRecord);
		            }
		            
		            //Write a new student object list to the CSV file
		           /* for (Student student : students) {
		                List<String> studentDataRecord = new ArrayList();
		                studentDataRecord.add(String.valueOf(student.getId()));
		                studentDataRecord.add(student.getFirstName());
		                studentDataRecord.add(student.getLastName());
		                studentDataRecord.add(student.getGender());
		                studentDataRecord.add(String.valueOf(student.getAge()));
		                csvFilePrinter.printRecord(studentDataRecord);
		            }*/
		            System.out.println("CSV file was created successfully !!!");
		        } catch (Exception e) {
		            System.out.println("Error in CsvFileWriter !!!");
		            e.printStackTrace();
		        } finally {
		            try {
		                fileWriter.flush();
		                fileWriter.close();
		                csvFilePrinter.close();
		            } catch (IOException e) {
		                System.out.println("Error while flushing/closing fileWriter/csvPrinter !!!");
		                e.printStackTrace();
		            }
		        }
		    }

	

}
