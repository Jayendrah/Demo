package com.cg.eis.pl;

import java.util.LinkedList;
import java.util.Scanner;
import com.cg.eis.bean.Employee1;
import com.cg.eis.exceptions.NumberException;
import com.cg.eis.service.InsuranceScheme;

public class EmployeeInsuranceDemo {

	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
		int age;
		age=scr.nextInt();
		try 
		{
			if(age<15)
				throw new NumberException();
		}
		catch(NumberException e) 
		{
			System.out.println(e);
		}
		
		System.out.println("Enter employee details");
		System.out.println("please enter employee id");
		String id=scr.next();
		
		System.out.println("please enter employee name");
		String name=scr.next();
		
		System.out.println("please enter employee salary");
		String salary=scr.next();
		
		System.out.println("please enter employee designation");
		String designation=scr.next();
		
		Employee1 emp= new Employee1();
		emp.setId(Integer.parseInt(id));
		emp.setName(name);
		emp.setSalary(Double.parseDouble(salary));
		emp.setDesignation(designation);
		
		InsuranceScheme i1 = new InsuranceScheme();
		emp.setInsuranceScheme(i1.calculateInsuranceScheme(Double.parseDouble(salary), designation));
		i1.calculateInsuranceScheme(Double.parseDouble(salary), designation);
		System.out.println(emp);
		LinkedList l1 = new LinkedList();
	}

}


