package com.cg.lab14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FpsDemo 
{
	public static void main(String[] args) 
	{
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "jayendra" ,55000));
		list.add(new Employee(1, "akash" ,36000));
		list.add(new Employee(1, "abhishek" ,25000));
		list.add(new Employee(1, "hasan" ,44000));
		list.add(new Employee(1, "honey" ,28000));
		
		Double list1 =list.stream().map((a)-> a.getSal()).reduce((a,b) -> a+b).get();
		System.out.println(list1);
	
	}
	
	
	
}
