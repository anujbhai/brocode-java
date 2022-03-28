public class Methods {
	public static void main(String[] args) {
		String name = "Anuj Upadhyay";
		int age = 20;
		hello(name, age);

		double x = 3.0;
		double y = 4.0;

		// Overloaded methods - methods that share the same namebut have different parameters
		// (method name + parameters = method signatures)

		// int z = add(x, y);
		// int z2 = add(x, y, 5);
		double z3 = add(x, y, 5.0, 11.0);
		System.out.println(z3);	

		//printf() - optional method to control, format, and display text to the console window
		//					2 arguments = format string + (object/variable/value)
		//					% [flags] [precision] [width] [conversion-character]
		boolean active = true;
		char myChar = '@';
		double height = 171.00;

		System.out.printf("User is active %b", active);
		System.out.println();	
		System.out.printf("Hello %4s .. Welcome!", name);
		System.out.println();	
		System.out.printf("You are %d yrs old.", age);
		System.out.println();	
		System.out.printf("You are %.2f cms tall", height);

		System.out.println();	
	}

	static void hello(String name, int age) {
		System.out.println("Hello " + name);	
		System.out.println("You are " + age + " yrs old");	
	}

	static int add(int x, int y) {
		System.out.println("This is overloaded method # 1");	
		int i = x + y;
		return i;
	}
	static int add(int x, int y, int z) {
		System.out.println("This is overloaded method # 2");	
		int i = x + y + z;
		return i;
	}
	static int add(int w, int x, int y, int z) {
		System.out.println("This is overloaded method # 3");	
		int i = w + x + y + z;
		return i;
	}

	static double add(double x, double y) {
		System.out.println("This is overloaded method # 1");	
		double i = x + y;
		return i;
	}
	static double add(double x, double y, double z) {
		System.out.println("This is overloaded method # 2");	
		double i = x + y + z;
		return i;
	}
	static double add(double w, double x, double y, double z) {
		System.out.println("This is overloaded method # 3");	
		double i = w + x + y + z;
		return i;
	}

}
