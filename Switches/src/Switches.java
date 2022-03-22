import java.util.*;

public class Switches {
    public static void main(String[] args) {
			String day = "Tuesday";

			switch(day) {
				case "Sunday": System.out.println("It is Sunday!");	
				break;
				case "Monday": System.out.println("It is Monday!");	
				break;
				case "Tuesday": System.out.println("It is Tuesday!");	
				break;
				case "Wednesday": System.out.println("It is Wednesday!");	
				break;
				case "Thursday": System.out.println("It is Thursday!");	
				break;
				case "Friday": System.out.println("It is Friday!");	
				break;
				case "Saturday": System.out.println("It is Saturday!");	
				break;
				default: System.out.println("That is not a day!");
			}

			// Logical Operators
			int temp = 25;

			if (temp > 30) {
					System.out.println("It is hot outside.");
			} else if (temp >= 20 && temp <= 30) {
					System.out.println("It is warm outside.");
			} else {
					System.out.println("It is cold outside.");
			}

			Scanner sc = new Scanner(System.in);
			System.out.println("You are playing a game! Press q or Q to quit");
			String response = sc.next();

			if (!response.equals("q") && !response.equals("Q")) {
				System.out.println("You are still playing the game *Pew Pew*");
			} else {
				System.out.println("You quit the game!");
			}
    }
}
