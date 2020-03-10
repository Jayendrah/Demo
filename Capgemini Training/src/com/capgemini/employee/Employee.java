package com.capgemini.employee;
//import java.util.*;
public class Employee {
	
	private int empID;
	private String empFirstName;
	private String empLastName;
	private double empSalary;
	
	
	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	public String empFullName() {
		return empFirstName+" "+empLastName;
	}
	
	public void empSalary(int app) {
		this.empSalary=(empSalary * (app*0.01))+empSalary;
	}
	
}
