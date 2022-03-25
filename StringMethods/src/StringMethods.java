public class StringMethods {
	public static void main(String[] args) {
		String name = "Anuj";	
		boolean result1 = name.equalsIgnoreCase("anuj");
		int result2 = name.length();
		char result3 = name.charAt(0);
		int result4 = name.indexOf("j");
		boolean result5 = name.isEmpty();
		String result6 = name.toUpperCase();

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
	}
}
