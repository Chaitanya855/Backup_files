package javaQuestions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		/*FileWriter fw = new FileWriter("C:\\Users\\0028TX744\\Desktop\\Notepad\\Test123.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hello Chaitu");
		
	   System.out.println("Finsihed!!!");
		
		bw.close(); */
		
		
		FileReader fr = new FileReader("C:\\\\Users\\\\0028TX744\\\\Desktop\\\\Notepad\\\\Test123.txt");
		BufferedReader br = new BufferedReader(fr);  
		
		String str;
		
		
		while((str = br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		
		
	}

}
