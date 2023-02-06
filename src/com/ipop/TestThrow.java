package com.ipop;

public class TestThrow {
	int d;
	public static void checkNum(int num)
	{
		if(num<1)
		{
			throw new ArithmeticException("We can't calculate the square of negative num");
		}
		else {
			int d=num*num;
			System.out.println("Square of the number is:"+d);
		}
	}
	public static void main(String[] args) {
		TestThrow t=new TestThrow();
		t.checkNum(7);
		//System.out.println("Rest of the code...");
	}

}
