package com.java.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Collections {

	public static void main(String[] args) {
		
		Map<String,String> employeedata1 = new HashMap<String,String>();
		employeedata1.put("Employee ID", "E001");
		employeedata1.put("Name", "Alice Green");
		employeedata1.put("Age", "30");
		employeedata1.put("Gender", "Female");
		employeedata1.put("Department", "Engineering");
		employeedata1.put("Position", "Software Engineer");
		employeedata1.put("Salary", "75,000");
		employeedata1.put("Email", "alice@example.com");
		employeedata1.put("Contact Number", "9876543213");
		//System.out.println(employeedata1);
		
		Map<String,String> employeedata2 = new HashMap<String,String>();
		employeedata2.put("Employee ID", "E002");
		employeedata2.put("Name", "Bob Johnson");
		employeedata2.put("Age", "35");
		employeedata2.put("Gender", "Male");
		employeedata2.put("Department", "Marketing");
		employeedata2.put("Position", "Marketing Manager");
		employeedata2.put("Salary", "85,000");
		employeedata2.put("Email", "bob@example.com");
		employeedata2.put("Contact Number", "9876543214");
		//System.out.println(employeedata2);
		Map<String,String> employeedata3 = new HashMap<String,String>();
		employeedata3.put("Employee ID", "E003");
		employeedata3.put("Name", "Carol White");
		employeedata3.put("Age", "28");
		employeedata3.put("Gender", "Female");
		employeedata3.put("Department", "Sales");
		employeedata3.put("Position", "Sales Executive");
		employeedata3.put("Salary", "65000");
		employeedata3.put("Email", "carol@example.com");
		employeedata3.put("Contact Number", "9876543215");
		
	//	System.out.println(employeedata1.isEmpty());
	//  System.out.println(employeedata2.size());
	//	System.out.println(employeedata2); 
		
		List<Map<String, String>> listedempdata = new ArrayList<Map<String,String>>();
		listedempdata.add(employeedata1);
		listedempdata.add(employeedata2);
		listedempdata.add(employeedata3);
		
		System.out.println(listedempdata.size());
		System.out.println(listedempdata.indexOf(employeedata2));
		System.out.println(listedempdata.get(1).size());
		//System.out.println(listedempdata.get(1).containsKey(Salary));
		System.out.println(listedempdata.get(1).get("Email"));
	}

}
