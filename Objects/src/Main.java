public class Main {
	public static void main(String[] args) {
		Car myCar1 = new Car();
		Car myCar2 = new Car();

		System.out.println(myCar1.make + " " + myCar1.model);
		System.out.println(myCar2.make + " " + myCar2.model);

		myCar1.drive();
		myCar1.brake();
	}

}
