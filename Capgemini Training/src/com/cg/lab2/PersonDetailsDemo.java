package com.cg.lab2;

import java.util.Scanner;

enum gender {
	M, F;
}

public class PersonDetailsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("Persons Details");
		System.out.println("__________________________\n");
		System.out.println("Enter First Name");
		String fname = scr.next();
		System.out.println("Enter Last Name");
		String lname = scr.next();
		System.out.println("Enter Gender M or F");
		String gender = scr.next();

		if ((gender.equals("M")) || (gender.equals("F"))) {

			PersonDetails p = new PersonDetails();
			p.setFname(fname);
			p.setLname(lname);
			p.setGender(gender.charAt(0));

			System.out.println(p);
		}

		else
			System.out.println("Please enter the correct gender");
	}

}
