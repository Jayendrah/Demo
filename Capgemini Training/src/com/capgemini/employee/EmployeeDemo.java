package com.capgemini.employee;
import java.util.Scanner;
public class EmployeeDemo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);		
		Employee emp=new Employee();
		
//		int empID=s.nextInt();
//		String empFirstName=s.next();
//		String empLastName=s.next();
//		double sal=s.nextDouble();
		
		System.out.println("Enter the Employee ID:");
		int emplID=s.nextInt();
		emp.setEmpID(emplID);
		
		System.out.println("Enter the Employee First Name:");
		String emplFirstName=s.next();
		emp.setEmpFirstName(emplFirstName);
		
		System.out.println("Enter the Employee Last Name:");
		String emplLastName=s.next();
		emp.setEmpLastName(emplLastName);
		
		System.out.println("Enter the Employee's Salary:");
		double emlSal=s.nextDouble();
		emp.setEmpSalary(emlSal);
		
		System.out.println("Enter the Employee hike:");
		int empHike=s.nextInt();
		emp.empSalary(empHike);
		
		
		Employee emp1=new Employee();
		emp1.setEmpID(460234);
		emp1.setEmpFirstName("Hannah");
		emp1.setEmpLastName("Abraham");
		
		Employee emp2=new Employee();
		emp2.setEmpID(460237);
		emp2.setEmpFirstName("Susan");
		emp2.setEmpLastName("Thomas");
		
		//emp=null;
		
		//System.out.println(emp.getEmpID());
//		System.out.println("Employee ID of "+emp.getEmpName()+" is: "+emp.getEmpID());
//		System.out.println("Employee ID of "+emp1.getEmpName()+" is: "+emp1.getEmpID());
//		System.out.println("Employee ID of "+emp2.getEmpName()+" is: "+emp2.getEmpID());
		System.out.println(emp.empFullName());
		System.out.println(emp.getEmpSalary());


	}

}
