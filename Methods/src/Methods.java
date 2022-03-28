public class Methods {
	public static void main(String[] args) {
		String name = "Anuj";
		int age = 20;
		hello(name, age);

		double x = 3.0;
		double y = 4.0;
		// int z = add(x, y);
		// int z2 = add(x, y, 5);
		double z3 = add(x, y, 5.0, 11.0);
		
		System.out.println(z3);	

		// Overloaded methods - methods that share the same namebut have different parameters
		// (method name + parameters = method signatures)
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
