public class Arrays {
	public static void main(String[] args) {
		String[] cars = {"Camaro", "Corvette", "Tesla"};
		cars[0] = "Mustang";

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		String[] bikes = new String[3];
		bikes[0] = "Ducati";
		bikes[1] = "Honda";
		bikes[2] = "Kawasaki";

		for (int i = 0; i < bikes.length; i++) {
			System.out.println(bikes[i]);
		}	
	}
}
