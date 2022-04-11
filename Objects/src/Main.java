public class Main {
	public static void main(String[] args) {
		// static - modifier. A single copy of a variable/method is created and shared.
		// 					The class "owns" the static mamber (shared by all instances of the class)

		Hero hero1 = new Hero("Batman", 42, "$$$");

		System.out.println(hero1.toString());
	}
}
