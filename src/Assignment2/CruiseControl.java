package Assignment2;

/**
 * CruiseControl for use in motorized vehicles
 * 
 * @invariant targetSpeed <= legalSpeed && targetSpeed >= 0
 */
public class CruiseControl {
	private boolean isActive;
	private float targetSpeed;
	private float legalSpeed;

	/** Creates a new inactive CruiseControl */
	public CruiseControl() {
		targetSpeed = 0;
		legalSpeed = 200; // GPS.getCurrentLegalSpeed();
		isActive = false;
		assert invariant();
	}

	/** Method for checking the invariant */
	public boolean invariant() {
		return targetSpeed >= 0 && targetSpeed <= legalSpeed;
	}

// Checks if speed is below or equal to the current maximum legal speed
	private boolean isLegal(float speed) {
		return speed <= legalSpeed;
	}

	/**
	 * Activates the Cruise control
	 * 
	 * @pre speed >= 0
	 * @post targetSpeed >=0
	 */
	public void activate(float speed) {
		assert invariant();
		assert speed >= 0;
		isActive = true;
		setTargetSpeed(speed) ; 
		assert invariant();
	}

	/**
	 * Checks if the CruiseControl is active or not
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * Changes the preferred speed which the cruise control tries to achieve
	 * @param speed the new preferred speed
	 * @pre speed >= 0 && isActive
	 * @post isLegal returns true
	 * 
	 * Eftersom isActive är en privat instansvariabel är det 
	 * omöjligt för klienten att kolla om Cruisen är aktiv eller inte
	 * Löses genom att skapa boolean metoden isActive()
	 */
	public void setTargetSpeed(float speed) {
		assert speed >= 0 && isActive;
		assert invariant();
		if (isLegal(speed))
			targetSpeed = speed;
		else
			targetSpeed = legalSpeed;
		assert invariant();
	}
	
	/*
	 * Test in main 
	 */
	public static void main(String[] args) {
		CruiseControl c1 = new CruiseControl();
		c1.activate(150);
		c1.setTargetSpeed(300);
		System.out.println(c1.targetSpeed);

		
	/* Uppgift a) Se metoden setTargetSpeed
	 * Uppgift b) Nej, klassvarianten måste vara
	 * uppfylld när objektet vefinner sig i stabilt
	 * tillstånd. 
	 * 
	 */
	}
}