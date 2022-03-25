import java.io.*;
import java.util.*;

public class WrapperClasses {
	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>();
		food.add("Pizza");
		food.add("Hamburger");
		food.add("Hotdog");

		food.set(0, "Sushi"); // replace provided index value
		food.remove(2); // Remove provided index value 
		food.clear(); // Remove all indexes

		for (int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));	
		}

	}
}
