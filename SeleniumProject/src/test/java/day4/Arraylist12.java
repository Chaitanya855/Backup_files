package day4;

import java.util.ArrayList;

public class Arraylist12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    cars.add(4,"pulsar");
	    cars.remove(1);
	    System.out.println(cars);

	}

}
