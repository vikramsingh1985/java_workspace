package org.ali;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.commons.csv.*;

public class CSVFileReadWrite {

	public static void main(String[] args) {
		try {
			String fileName = System.getProperty("user.home")+"/user.csv";
			CSVFileWriter.writeCsvFile(fileName);
			CSVParser parser = new CSVParser(new FileReader("/home/wigzo/user.csv"), CSVFormat.DEFAULT.withHeader());
			List<CSVRecord> list = parser.getRecords();
			System.out.println("no of records: " + list.size());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
