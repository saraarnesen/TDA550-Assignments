package Assignment3;

public class TolerantFloat extends Float {
	public static final float TOLERANCE = 0.01f;

	public TolerantFloat(float f) {
		super(f);
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Float)) {
			return false;
		}
		float f1 = floatValue();
		float f2 = ((Float) o).floatValue();
		return (Math.abs(f1 - f2) <= TOLERANCE);
	}
}