package Assignment5;

import java.util.Comparator;

/**
 * Comparator for comparing car serial numbers
 */
public class SerialNumberComparator extends AbstractComparator<Car> {
	/**
	 * @param comparator other decorator possible null
	 * @param ascending
	 */
	public SerialNumberComparator(Comparator<Car> comparator, Order order) {
		super(comparator, order);
	}

	@Override
	public int doCompare(Car c1, Car c2) {
		String name1 = c1.getSerialNumber();
		String name2 = c2.getSerialNumber();
		return name1.compareTo(name2);
	}
}