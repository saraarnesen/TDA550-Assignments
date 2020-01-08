package Assignment1;

public class Snake extends Creature {
	
	public Snake(String n){
		super(n) ; 
	}
	public int doDamage() {
		int damage = 10 * this.getEnergy() ; 
		return damage ;
	}

}
