package Assignment1;

public class Spider extends Creature {
	public Spider(String n){
		super(n) ; 
	}
	public int doDamage() {
		if(this.getEnergy()>5) {
			int damage = 100 ; 
			return damage ; 
		}
		return 0 ; 
	}

}


