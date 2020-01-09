package Assignment5;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CarSortingDemo {
public static void main(final String[] args) {
 ArrayList<Car> cars = new ArrayList<Car>();
 cars.add(new Car("Volvo", "Amazon", 1969, "12345678"));
 cars.add(new Car("Saab", "9000", 1988, "3463658"));
 cars.add(new Car("Volvo", "PV", 1962, "34853648"));
 cars.add(new Car("Rover", "Streetwise", 2004, "7744229"));
 cars.add(new Car("Volvo", "Amazon", 1968, "10857043"));
 cars.add(new Car("Saab", "900", 1982, "12345678"));
 final Comparator<Car> myCarComp = new ModelYearComparator(
 new ModelNameComparator(new ManufacturerComparator(null,
 Order.ASCENDING), Order.ASCENDING), Order.DESCENDING);
 Collections.sort(cars, myCarComp);
 for (final Car c : cars) {
 System.out.println(c);
 }
}
}
