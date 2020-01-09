package Assignment5;

public class TestClass {
	public static void main(String[] args) {
		Flower f = new Flower("Tulip");
		Bee b1 = new Bee("Bertil");
		Bee b2 = new Bee("Berit");
		f.addObserver(b1);
		f.bloom();

	}
}
