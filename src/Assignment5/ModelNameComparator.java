package Assignment5;

import java.util.Comparator;
/**
 * Comparator for comparing car model names
 */
public class ModelNameComparator extends AbstractComparator<Car> {
/**
 * @param comparator other decorator possible null
 * @param ascending
 */
public ModelNameComparator(Comparator<Car> comparator, Order order) {
 super(comparator, order);
}
@Override
public int doCompare(Car c1, Car c2) {
 String name1 = c1.getModelName();
 String name2 = c2.getModelName();
 return name1.compareTo(name2);
}
}