public class Main {
	public static void main(String[] args) {
		Car car1 = new Car("Mitsubishi", "Eclipse", 2022);	
		// Car car2 = new Car("Ford", "EcoSport", 2023);	

		// car1.copyObj(car2);

		Car car2 = new Car(car1);

		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
	}
}
