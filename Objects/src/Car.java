public class Car {
	// toString() - Special method that all methods inherit.
	//							- Returns a string that textually represents a string
	//							- can be used either implicitly and/or explicitly

	String make = "Porsche";
	String model = "Safari";
	int year = 2015;
	String color = "Sand";
	double price = 50000.00;

	void drive() {
		System.out.println("Baby you can drive my car!");
	}

	void brake() {
		System.out.println("Brakes applied");
	}

	public String toString() {
		String myString = make + "\n" + model + "\n" + color + "\n" + year; 
		return myString;
	}
}
