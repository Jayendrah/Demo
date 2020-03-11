package com.cg.lab14;

@FunctionalInterface

 interface Powerlambda 
 {
double compute(double x,double y);
}

public class Power{
	public static void main(String[] args) {
		Powerlambda p=Math::pow;
		System.out.println(p.compute(2,4));
	}
}
