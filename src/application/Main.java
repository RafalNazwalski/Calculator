package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String mathematicalOperation;
		String[] values;
		String[] operations;
		Double result = null;
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Provide mathematical operation: ");
		mathematicalOperation = scanner.nextLine().replaceAll(" ", "");;
		System.out.println("I am printing operation: " + mathematicalOperation);
		
		String delims = "[+\\-*/\\^ ]+"; // so the delimiters are:  + - * / ^ space
		
		values = mathematicalOperation.split(delims);
		
		for (String value : values) {
			System.out.println("I am printing values in array: " + value);
		}
		
		operations = mathematicalOperation.split("[0-9]+");
		
		//remove first operation from operations array
		
		for(String operation : operations){
			System.out.println("I am printing operations in array: " + operation);
		}
		
		System.out.println("Operations length: " + operations.length);
		
//		while(operations.){
//			
//		}
		
		
	}

}
