package com.ipop;

public class ThreadDemo extends Thread {
	public void run()
	{
		
	
	for(int i=1;i<=10;i++)
	{
		//System.out.println(i);
	     try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     System.out.println(i);
	}

}
	public static void main(String[] args) {
		ThreadDemo demo=new ThreadDemo();
		demo.start();
		
	}
}