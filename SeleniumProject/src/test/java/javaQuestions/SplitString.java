package javaQuestions;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) 
	{
		

		/*Scanner sc = new Scanner(System.in);
		String str = sc.next();*/
		
		int i;
		
		String str = "java,Python,Selenium";
		
		String[] arrSplit = str.split(",");
		
		for(i=0; i<arrSplit.length;i++)
		{
		System.out.println(arrSplit[i]);
		}
		
		//System.out.println(arrSplit[2]);
		
		
		
		
	}

}
