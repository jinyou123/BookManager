
public class Application {
	public static void main(String[] args) {
		Simulator simulator = new Simulator();
		Dog dog = new Dog();
		simulator.playSound(dog);
		simulator.playSound(new Cat());
	}
}
