package Assignment4;

public class IncrementableInteger {
	private int intField;

	public IncrementableInteger(int i) {
		intField = i;
	}

	public void increment() {
		intField = intField + 1;
	}

	public int getIntField() {
		return intField;
	}

	public String toString() {
		return String.valueOf(intField);
	}
}