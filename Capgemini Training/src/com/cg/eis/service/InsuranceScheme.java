package com.cg.eis.service;

import com.cg.eis.bean.Employee1;

public class InsuranceScheme implements insuranceschemeimplementation {

	public String calculateInsuranceScheme(double salary, String designation)
	{
		if(salary>5000 && salary<20000 && designation.equals("System Associate"))
		{
			return "Scheme C";
		}
		else if(salary>20000 && salary<40000 && designation.equals("Programmer"))
		{
	        return "Scheme B";
		}
		else if(salary>=40000 && designation.equals("Manager"))
		{
			return "Scheme A";
		}
		else
		{
			return "No Scheme";
		}
		
	}

}
