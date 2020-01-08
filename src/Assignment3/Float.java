package Assignment3;

public class Float {
	private float f;

	public Float(float f) {
		this.f = f;
	}

	public float floatValue() {
		return f;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Float)) {
			return false;
		}
		float f1 = floatValue();
		float f2 = ((Float) o).floatValue();
		return (f1 == f2);
	}
// more methods here, irrelevant to this exercise.
}