public class Main {
	public static void main(String[] args) {
		Garage garage = new Garage();
		Car car1 = new Car("Honda CDR1000RR");
		Car car2 = new Car("Ducati Monster");

		garage.park(car1);
		garage.park(car2);
	}
}
