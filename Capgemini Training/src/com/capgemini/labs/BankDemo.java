package com.capgemini.labs;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("entry for kathy");
		System.out.println("enter name");
		String name = scr.next();
		
		System.out.println("enter age");
		String age = scr.next();
		
		Person p = new Person();
		p.setFirstName(name);
		p.setAge(Integer.parseInt(age));
		
		
		System.out.println("enter balance");
		String balance = scr.next();
		
		Account act = new Savings();
//		act.setAccNo(Long.parseLong(aacNo));
		act.setBalance(Double.parseDouble(balance));
		System.out.println(act);
		System.out.println("Enter amount to withdraw");
		String amount=scr.next();
		boolean test =act.withdraw(Double.parseDouble(amount));
		if(!test)
			System.out.println("Transaction failed.You dont have enough balance");
		System.out.println(act.getBalance());
		act.setAccHolder(p);
		
		System.out.println("enter for Smith");
		System.out.println("enter name");
		String name1 = scr.next();
		
		System.out.println("enter age");
		String age1 = scr.next();
		
		Person p1 = new Person();
		p1.setFirstName(name1);
		p1.setAge(Integer.parseInt(age1));
		
		System.out.println("enter balance");
		String balance1 = scr.next();
		
		Account act1 = new Savings();
//		act.setaccNo(Account.getAccNo);
		act1.setBalance(Double.parseDouble(balance));
		System.out.println(act1);
		System.out.println("Enter amount to withdraw");
		String amount1=scr.next();
		boolean test1 =act.withdraw(Double.parseDouble(amount1));
		if(!test1)
			System.out.println("Transaction failed.You dont have enough balance");
		System.out.println(act1.getBalance());
		act1.setAccHolder(p1);
	
		
		System.out.println(act1);
	}

}
