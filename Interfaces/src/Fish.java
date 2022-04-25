public class Fish implements Prey, Predator {
	@Override
	public void hunt() {
		System.out.println("Chasing after smaller fishes..");
	}

	@Override
	public void flee() {
		System.out.println("Running away from big fishes..");
	}

}
