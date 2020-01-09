package Assignment5;

import java.util.Comparator;

/**
 * Comparator for comparing car model years
 */
public class ModelYearComparator extends AbstractComparator<Car> {
	/**
	 * @param comparator other decorator possible null
	 * @param ascending
	 */
	public ModelYearComparator(Comparator<Car> comparator, Order order) {
		super(comparator, order);
	}

	@Override
	public int doCompare(Car c1, Car c2) {
		int year1 = c1.getModelYear();
		int year2 = c2.getModelYear();
		if (year1 == year2) {
			return 0;
		}
		if (year1 > year2) {
			return 1;
		}
		return -1;
	}
}