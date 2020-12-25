package com.exceptions;

import java.util.Scanner;

public class Simulation {
	
	public static void main(String[] args) {
		try {
			getInput();
		} catch (EvenNumberException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void getInput() throws EvenNumberException{
		Scanner in = new Scanner(System.in);
		
		// get input from user
		System.out.println("Type a number & press <Enter>");
		String line = in.nextLine();
		System.out.println("You've typed: " + line);
		
		//test for even number
		if (isEven(line)) {
			try {
			throw new EvenNumberException();
			}finally {
				in.close();  // close resource, prevent leaks.
			}
			
		}
		
		//close resources
		in.close();
	}
	
	public static boolean isEven(String num) {
		//convert value to a number
		int value = Integer.parseInt(num);
		return (value %2 == 0);
	}
}
