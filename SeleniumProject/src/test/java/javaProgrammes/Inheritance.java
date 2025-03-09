package javaProgrammes;

 class HelloWorld 
{
    
    	void eat()
	{
		System.out.println("eating.....");
	}
}

class USA extends HelloWorld
{
    void eat()
	{
		System.out.println("eating bread");
		
	}

}

public class Inheritance {

	public static void main(String[] args) 
	{
		
	        USA inherit = new USA();
	        inherit.eat();
		

	}

}
