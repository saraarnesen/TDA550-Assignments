package Assignment4;

import java.util.Comparator;

public final class Car implements Comparable<Car> {
	private final String manufacturer; // 2
	private final String modelName; // 3
	private final int modelYear; // 1
	private final String serialNumber;

	public Car(String manufacturer, String modelName, int modelYear, String serialNumber) {
		this.manufacturer = manufacturer;
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.serialNumber = serialNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModelName() {
		return modelName;
	}

	public int getModelYear() {
		return modelYear;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public String toString() {
		return " manufacturer: " + this.manufacturer + ", modelName: " + this.modelName + ", modelYear: "
				+ this.modelYear + ", serialNumber: " + this.serialNumber;
	}

	public int compareTo(Car o) {
		if (this.modelYear != o.modelYear) {
			return this.modelYear - o.modelYear;
		}
		if (this.manufacturer != o.manufacturer) {
			return this.manufacturer.compareTo(o.manufacturer);
		}
		if (this.modelName != o.modelName) {
			return this.modelName.compareTo(o.modelName);
		} else
			return 0;

	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || !(o instanceof Car)) {
			return false;
		}
		Car car = (Car) o;
		return this.modelYear == car.modelYear && this.manufacturer.equals(car.manufacturer)
				&& this.modelName.equals(car.modelName);
	}

	public class CarComparator implements Comparator<Car> {

		@Override
		public int compare(Car c1, Car c2) {
			int diff = c1.getManufacturer().compareTo(c2.getManufacturer());
			if (diff != 0) {
				return diff;
			}
			diff = c1.getModelYear() - c2.getModelYear();
			if (diff != 0) {
				return diff;
			}
			return c1.getModelName().compareTo(c2.getModelName());

		}

	}

}