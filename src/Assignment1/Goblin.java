package Assignment1;

public class Goblin extends Creature {

	public Goblin(String n) {
		super(n);
	}

	public int doDamage() {
		int damage = 4 * this.getEnergy() * this.getEnergy();
		return damage ; 
	}

}
