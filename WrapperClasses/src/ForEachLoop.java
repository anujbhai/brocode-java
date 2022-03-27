import java.util.*;

public class ForEachLoop {
	public static void main(String[] args) {
		// for-each - traversing technique to iterate through the elements in an array/collection
		// less steps, more readable
		// less flexible
		String[] aminals = {"cat", "dog", "rat", "bird"};

		for (String i : aminals) {
			System.out.println(i);
		}

		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Cow");
		animals.add("Buffalo");
		animals.add("Frog");
		animals.add("Hare");

		for (String i : animals) {
			System.out.println(i);
		}

}
}
