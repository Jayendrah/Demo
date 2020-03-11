package com.cg.lab14;
@FunctionalInterface

	interface fact{
	int factN(int e);
		
	}

public class Lambda14_5
{
public static void main(String[] args)
{
	fact ob=f->
	{
		int fact=1;
		for(int i=1;i<=f;i++)
		{
			fact=fact*i;
		}
		return fact;
		
	};
	System.out.println(ob.factN(5));
	
}
}
