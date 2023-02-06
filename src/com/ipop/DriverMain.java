package com.ipop;

public class DriverMain {
	public static void main(String[] args) {
		Account acc=new Account();
		System.out.println("Currenent balance is:"+acc.balance());
		acc.withdraw(1000);
		System.out.println("After withdraw current balance is:"+acc.balance());
	}

}
