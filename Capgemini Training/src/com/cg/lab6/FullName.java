package com.cg.lab6;

public class FullName {

	public static void main(String[] args) 
	{
		String fname="";
		String lname="";
		try {
			if(fname.equals("")|| lname.equals(""))
			throw new UserException("The name cannot be blank");
			System.out.println(fname+" "+lname);
		}catch(UserException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Fianlly ststement");
		}
	}

}
