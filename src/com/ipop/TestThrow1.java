package com.ipop;

public class TestThrow1 {
	public static int divideNum(int m,int n) throws ArithmeticException
	{
		int div=m/n;
		return div;
	}
	public static void main(String[] args) {
		TestThrow1 t1=new TestThrow1();
		try {
			System.out.println("The division of two no is:"+t1.divideNum(45, 9));
		}
		catch(ArithmeticException e)
		{
			System.out.println("number can't be divide by 0");
		}
	}

}
