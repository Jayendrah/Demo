package com.cg.lab6;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter age");
		int age=scr.nextInt();	
		try {
			AgeUtility.ageValidation(age);
			System.out.println("Age is "+age);
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}

	}

}
