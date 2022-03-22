import java.util.*;

public class Loops {
	public static void main(String[] args) {
		// While loop
		Scanner sc = new Scanner(System.in);
		String name = "";

		while(name.isBlank()) {
			System.out.print("Please enter your name: ");
			name = sc.nextLine();
		}
		System.out.println("Hello " + name);	

		// For loop
		for(int i = 10; i >= 0; i--) {
			System.out.println("Count: " + i);
		}
		System.out.println("Happy new year!");	

		// Nested loop
		int rows;
		int columns;
		String symbol = "";

		System.out.println("Enter # of rows: ");
		rows = sc.nextInt();

		System.out.println("Enter # of columns: ");
		columns = sc.nextInt();

		System.out.println("Enter symbol to use: ");
		symbol = sc.next();

		for(int i = 1; i <= rows; i++) {
			System.out.println();

			for(int j = 1; j <= columns; j++) {
				System.out.print(symbol);
			}
		}

		System.out.println();
	}
}
