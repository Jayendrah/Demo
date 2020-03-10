package com.capgemini.employee;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String s1="jayendra";
		String s2="harshe";
		String s3=s1+s2;
		char[] s4=s3.toCharArray();
		for(int i=0;i<s4.length;i++) {
	     s4[i]='#';
			i++;
	}
		for(int i=0;i<s4.length;i++) {
			System.out.println(s4[i]);
		}
		
		s1=s1.concat(s1);
		System.out.println(s1);
		
		
		Scanner scr=new Scanner(System.in);
		Person p= new Person();
		
		System.out.println("Enter First Name of Person");
		String firstname=scr.next();
		
		System.out.println("Enter Last Name of Person");
		String lastname=scr.next();
		
		System.out.println("Enter Phone Number");
		String phno=scr.next();
		
		System.out.println("Enter Gender");
		String gender=scr.next();
		
		if((gender.equals("M"))|| (gender.contentEquals("F"))) {
		
		p.setFirstname(firstname);
		p.setLastname(lastname);
		p.setPhno(phno);
		p.setGender(gender.charAt(0));
		
		
	}else 
		System.out.println("Please enter correct gender values");
	}
	
}
