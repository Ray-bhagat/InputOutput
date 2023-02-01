package com.ipop;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test1 {
	public static void main(String[] args) {
		Student stud=new Student();
		stud.name="Ankita";
		stud.rollno=110;
		stud.city="Pune";
		try
		{
			FileOutputStream fo=new FileOutputStream("C:\\Users\\A1\\Desktop\\Anki.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fo);
		oos.writeObject(stud);
		oos.flush();
		System.out.println("Serilaization done...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
