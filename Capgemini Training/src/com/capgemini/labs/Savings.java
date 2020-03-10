package com.capgemini.labs;

public class Savings extends Account {
	private final double minBalance=1000;
	@Override
	public boolean withdraw(double amount) {
		if((super.getBalance()>=minBalance && (super.getBalance() - amount)>=minBalance)) {
			super.setBalance(super.getBalance()-amount);
		return true;
	}else
		return false;
	}

}
