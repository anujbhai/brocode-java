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

		// 2d ArrayList - a dynamic list of lists
		// We can change the size of this lists during runtime

		ArrayList<ArrayList<String>> groceryList = new ArrayList(); 

		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("garlic bread");
		bakeryList.add("pasta");
		bakeryList.add("donuts");

		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");

		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");

		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);

		System.out.println(groceryList.get(2).get(0));	
	}
}
