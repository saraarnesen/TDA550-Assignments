package Assignment1;

	public abstract class Creature {
	private int energy = 100;
	private String name;

	public Creature(String n) {
		this.name = n;
	}
	
	public abstract int doDamage() ;

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int e) {
		this.energy = e;
	}

	public String getName() {
		return name;
	}
}
