package com.ipop;

import java.util.Scanner;

public class TestClass {
	private  int rollNo;
	private String name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		/*TestClass t=new TestClass();
		t.rollNo=10;
		t.name="Ankita";
		System.out.println(t.rollNo);
		System.out.println(t.name);*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter roll no");
		int rollno=scan.nextInt();
		System.out.println("Enter name");
		String name=scan.next();
		TestClass t=new TestClass();
	t.rollNo=rollno;
	t.name=name;
	System.out.println("Roll No is:"+rollno);
	System.out.println("Name is:"+name);
	
	
		
	}

}
