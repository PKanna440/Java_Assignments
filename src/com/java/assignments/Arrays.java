package com.java.assignments;

public class Arrays {

public static void main(String[] args) {
		
			//Approach 2
		String [][][] SemMarks = {
				{
					{"Mathematics I","78"},
					{"Physics","85"},
					{"Chemistry","91"},
					{"Computer Programming","74"},
					{"Engineering Drawing","88"},
					{"Basic Electrical Eng","79"}
				},
				
				{
					{"Mathematics II","82"},
					{"Mechanics","77"},
					{"Environmental Sci","93"},
					{"Basic Electronics","69"},
					{"Engineering Physics","84"},
					{"Engineering Graphics","90"}
				},
				
				{
					{"Data Structures","88"},
					{"Discrete Mathematics","81"},
					{"Digital Electronics","76"},
					{"Operating Systems","92"},
					{"Signals and Systems","85"},
					{"Object-Oriented Prog.","78"}
				},
				
				{
					{"Algorithms","91"},
					{"Computer Networks","73"},
					{"Database Systems","89"},
					{"Microprocessors","80"},
					{"Communication Eng.","76"},
					{"Software Engineering","87"}
				},
				
				{
					{"Probability & Stats", "86"},
					{"Machine Learning","88"},
					{"Compiler Design","84"},
					{"Theory of Computation","95"},
					{"Embedded Systems","73"},
					{"Computer Graphics","90"}

				}
		};
		
		//Print Semester 3 - Subject 4 and Subject 5 Names.
		System.out.println("Semester 3 - Subject 4 and Subject 5 are: "+SemMarks[2][3][0] +" & " +SemMarks[2][4][0]); 
		
		//Print Semester 5 - Subject 3 and Subject 6 marks
		System.out.println("Semester 5 - Subject 3 and Subject 6 marks are: "+SemMarks[4][2][1] +" & " +SemMarks[4][5][1]);
		
		// Print Subject Name & Marks
		System.out.println("Sem 2 Subject 2: " +SemMarks[1][1][0]+" Marks: "+SemMarks[1][1][1]); 
		
        /* Below are for practise
		System.out.println("Semester 1 - Subject 4 and Subject 5 are: "+SemMarks[0][3][0] +" & " +SemMarks[0][4][0]); 
		System.out.println("Semester 1 - Subject 3 and Subject 6 marks are: "+SemMarks[0][2][1] +" &  Marks are: " +SemMarks[0][5][1]);
		*/
		//Approach 1
		/*
		String [][][] SemMarks = {
				{
					{"Mathematics I","Physics","Chemistry","Computer Programming","Engineering Drawing","Basic Electrical Eng"},
					{"78","85","91","74","88","79"}
				},
				
				{
					{"Mathematics II","Mechanics","Bsc"},
					{"82","77","93"}
				},
				
				{
					{"Data Structures","Discrete Mathematics"},
					{"88","81"}
				}
		};

		System.out.println("Sem1 Subjectnames are: "+SemMarks[0][0][0] +" & " +SemMarks[0][0][1]); 

		System.out.println("Sem 3 Marks are: "+SemMarks[2][1][0] +" & " +SemMarks[2][1][1]);
		
		System.out.println("Sem 2 Subject 2: " +SemMarks[1][0][1]+" Marks: "+SemMarks[1][1][1]);
		
		*/
		
	}


}
