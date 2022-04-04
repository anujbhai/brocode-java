import java.util.*;

public class DIceRoller {
	Random random;
	int n;

	DIceRoller() {
		random = new Random();
		roll(random, n);
	}

	void roll(Random random, int n) {
		n = random.nextInt(9) + 1;	
		System.out.println(n);
	}
}
