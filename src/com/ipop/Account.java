package com.ipop;

public class Account {
	private int balance=3500;
	public int balance()
	{
		return balance;
	}
	public void withdraw(int amount)
	{
		if(amount>balance)
		{
			throw new InSufficientFundException("Insufficient balance in ur account");
		}
		balance=balance-amount;
	}
	

}
