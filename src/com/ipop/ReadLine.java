package com.ipop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadLine {
	public static void main(String[] args) {
		try {
			FileInputStream fir=new FileInputStream("C:\\Users\\A1\\Desktop\\drivelink.txt");
			Scanner scan=new Scanner(fir);
			while(scan.hasNext())
			{
				System.out.println(scan.nextLine());
			}
			scan.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			FileWriter fw=new FileWriter("C:\\Users\\A1\\Desktop\\Anki.txt");
			fw.write("Hello Ankita");
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
