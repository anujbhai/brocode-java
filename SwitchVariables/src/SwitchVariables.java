public class SwitchVariables {
	public static void main(String[] args) {
		String x = "water";
		String y = "Kool-Aid";
		String temp;

		temp = x; // water put to temp, now x is empty
		x = y; // kool-aid put to x, now y is empty
		y = temp; // water transferred from temp to y, now temp should be back to empty

		/* Successfully switched variable values */

		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("temp: " + temp);
	}
}
