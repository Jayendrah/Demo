package com.cg.lab14;

@FunctionalInterface
interface UserNamePasswordAuth{
	boolean auth(String username,String password);
}
public class Lambda14_3 
{
	public static void main(String[] args)
	{
		UserNamePasswordAuth usernamePasswordAuth=(u,p)->u.equalsIgnoreCase("jayendra")&&
		p.equalsIgnoreCase("password@123");
		System.out.println(usernamePasswordAuth.auth("jayendra", "password"));
		System.out.println(usernamePasswordAuth.auth("jayendra", "password@123"));
		
		
	}

}
