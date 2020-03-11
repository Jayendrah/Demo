package com.cg.lab14;

public class Employee 
{	
	private int id;
	private String name;
	private double sal;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name=name;
	}
	public double getSal()
	{
		return sal;
	}
	public void setSal(double sal)
	{
		this.sal=sal;
	}
	
	
	public Employee(int id, String name, double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public String toString()
	{
		return "Employee [Id= "+id+",Name= "+name+", Sal " +sal+ "]";
	}
	
	
}


