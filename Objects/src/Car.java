public class Car {
	// toString() - Special method that all methods inherit.
	//							- Returns a string that textually represents a string
	//							- can be used either implicitly and/or explicitly

	String name;

	Car(String name) {
		this.name = name;
	}

	public String toString() {
		String myString = name + "\n"; 
		return myString;
	}
}
