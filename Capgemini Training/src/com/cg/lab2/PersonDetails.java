package com.cg.lab2;

public class PersonDetails {
	private String fname;
	private String lname;
	private char gender;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char c) {
		this.gender = c;
	}

	@Override
	public String toString() {
		return "PersonDetails [fname=" + fname + ", lname=" + lname + ", gender=" + gender + "]";
	}

}
