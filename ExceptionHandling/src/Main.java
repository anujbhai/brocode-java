import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a whole number to divide: ");
            int x = sc.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = sc.nextInt();

            int z = x / y;

            System.out.println("result: " + z);
        } catch(ArithmeticException e) {
            System.out.println("Dividing by zero will create exception/error, .. try other number.");
        } catch(Exception e) {
            System.out.println("something went wrong, .. try other number.");
        } finally {
            System.out.println("This will always print.");
        }
	}
}
