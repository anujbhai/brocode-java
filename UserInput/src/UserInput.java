import java.util.*;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("What is your name? ");
		String name = sc.nextLine();

		System.out.println("How old are you? ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("What is your fav food? ");
		String food = sc.nextLine();

		System.out.println("Hello " + name);
		System.out.println("You are " + age + " yrs old.");
		System.out.println("You like " + food);
	}
}
