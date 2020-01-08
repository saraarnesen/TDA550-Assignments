package Assignment3;

public class NamedPoint extends Point {
	private final String name;

	public NamedPoint(int x, int y, String name) {
		super(x, y);
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point)) {
			return false;
		}
		// If o is a normal Point, do a name-blind comparison
		if (!(o instanceof NamedPoint)) {
			return o.equals(this);
		}
		// o is a NamedPoint; do a full comparison
		return super.equals(o) && ((NamedPoint) o).name.equals(name);
	}
}
