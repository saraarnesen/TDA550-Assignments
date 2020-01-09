package Assignment5;

import java.util.Comparator;

public abstract class AbstractComparator<T> implements Comparator<T> {
	private final Comparator<T> comparator; // The decorator comparator
	private final Order order;

	protected AbstractComparator(Comparator<T> comparator, Order order) {
		this.comparator = comparator;
		this.order = order;
	}

	@Override
	public int compare(T o1, T o2) { // Template method
		if (o1 == o2) {
			return 0;
		}
		if (comparator != null) {
			int result = comparator.compare(o1, o2);
			if (result != 0) {
				return result;
			}
		}
		int result = doCompare(o1, o2);
		return this.order == Order.ASCENDING ? result : -result;
	}

	// Subclasses should implement this hook method:
	protected abstract int doCompare(T o1, T o2);
}
