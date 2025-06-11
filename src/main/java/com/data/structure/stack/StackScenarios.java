package com.data.structure.stack;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class StackScenarios {

	public static void main(String args[]){  
	
	System.out.println("Enter date of birth in YYYY-MM-DD format: ");  
	Scanner scanner = new Scanner(System.in);  
	//Reads the date of birth from the user  
	String input = scanner.nextLine();  
	scanner.close();  
	LocalDate dob = LocalDate.parse(input);  
	System.out.println("You are " + calculateAge(dob)+" years old.");	
	                                      }

	// The method calculates the age
	public static int calculateAge(LocalDate dob) {
		LocalDate curDate = LocalDate.now();
		if ((dob != null) && (curDate != null)) {
			return Period.between(dob, curDate).getYears();
		} else {
			return 0;
		}
	}

}
