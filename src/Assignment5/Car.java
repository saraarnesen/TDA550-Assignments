package Assignment5;

public final class Car {
	private final String manufacturer;
	private final String modelName;
	private final int modelYear;
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
}