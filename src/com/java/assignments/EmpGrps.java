package com.java.assignments;

public class EmpGrps {

	public static void main(String[] args) {
	// We will read data from Employees Class.
		
		Employees empdata = new Employees();
		
		String EmpNames[] = new String [3];
		int EmpIDs[] = new int [3];
		
		//EmpGrps empgrp = new EmpGrps();
		
		EmpNames[0] = empdata.Emp1;
		EmpNames[1] = empdata.Emp2;
		EmpNames[2] = empdata.Emp3;
		
		EmpIDs[0] = empdata.Emp_ID_1;
		EmpIDs[1] = empdata.Emp_ID_2;		
		EmpIDs[2] = empdata.Emp_ID_3;
		
		// print each employee's name along with their corresponding ID.
		
		System.out.println("Employee Name: "+EmpNames[0] +"," +" Employee ID: "+EmpIDs[0]);
		System.out.println("Employee Name: "+EmpNames[1] +"," +" Employee ID: "+EmpIDs[1]);
		System.out.println("Employee Name: "+EmpNames[2] +"," +" Employee ID: "+EmpIDs[2]);

		// Using for loop
		System.out.println("********Using for Loop********");
		for (int i =0; i<3;i++)
		System.out.println("Employee Name: "+EmpNames[i] +"," +" Employee ID: "+EmpIDs[i]);
		

	}

}
