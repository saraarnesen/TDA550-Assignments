package Assignment5;

import java.util.Comparator;

/** Comparator for comparing car manufacturers */
public class ManufacturerComparator extends AbstractComparator<Car> {
	/**
	 * @param comparator other decorator possible null
	 * @param ascending
	 */
	public ManufacturerComparator(Comparator<Car> comparator, Order order) {
		super(comparator, order);
	}

// Note : doCompare, not compare; different methods.
	@Override
	public int doCompare(Car c1, Car c2) {
		String name1 = c1.getManufacturer();
		String name2 = c2.getManufacturer();
		return name1.compareTo(name2);
	}
}
