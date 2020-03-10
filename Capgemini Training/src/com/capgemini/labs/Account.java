package com.capgemini.labs;

public abstract class Account {
	
	private static long accNo=10000;
	private double balance;
	private Person accHolder;
	
	
	Account(){
		accNo++;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ballance=" + balance + ", accHolder=" + accHolder + "]";
	}
	public static long getAccNo() {
		return accNo;
	}
	public static void setAccNo(long accNo) {
		Account.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

    public abstract boolean withdraw(double amount);
   
	}
	

