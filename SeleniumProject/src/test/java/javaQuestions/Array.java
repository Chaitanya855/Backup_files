package javaQuestions;

public class Array {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		//To print in normal way
		/*for ( int i=0; i< a.length;i++)
		{
			System.out.println(i);
		}*/
		
		
		//To print in reverse order
		/*for (int i= a.length-1;i>0;i--)
		{
			System.out.println(i);
		}*/
		
		//To print alternative elements
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.println(i);
		}
		

	}

}
