public class Car extends Vehicle {
	// toString() - Special method that all methods inherit.
	//							- Returns a string that textually represents a string
	//							- can be used either implicitly and/or explicitly

	@Override
	void go() {
		System.out.println("The driver is driving the car");	
	}
}
