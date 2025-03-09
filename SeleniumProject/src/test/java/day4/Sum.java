package day4;

interface Sum1 
{
	  void gettotal(int a, int b);
}

class A implements Sum1 {

	  // implementation of abstract method
	  public void gettotal(int a, int b) {
	    System.out.println("Sum of 2 numbers " + (a + b));
	  }
	}


public class Sum {

	public static void main(String[] args) {
		A h = new A();
		h.gettotal(12,31);
		
	}

}
