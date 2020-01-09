package TryObservable;

import java.beans.PropertyChangeEvent;

public class Mouse implements Observer {
	private String name ; 
	private int Cheese = 0 ; 
	
	public Mouse(String name) {
	this.name = name ; 	
	}
	
	public String getName() {
		return this.name ; 
	}
	public int getCheese() {
		return this.Cheese ; 
	}
	public void setCheese(int Cheese) {
		this.Cheese = Cheese ;	
	}
	
	public boolean mouseTricked() {
		if(this.getCheese()>0) {
			System.out.println(this.getName() + " got tricked by cat and ate " + this.getCheese() + " cheese");
			return true ; 
		}
		else {
			System.out.println("Mouse " + this.getName() + " wasn't fooled by Cat named: " + this.name);
			return false ; 
		}
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
			if(mouseTricked()) {
				if(this.getCheese()>2) {
				System.out.println("Mouse " + this.name + " ate too many cheese, mouse can't move");
				((Cat)evt.getSource()).killMice(this);
			}
				else {
				System.out.println("Mouse " + this.name + " is tricked, but manage to escape and gets hunted ");
				((Cat)evt.getSource()).huntMice(this) ; 
				}
			}
			else {
				((Cat)evt.getSource()).mouseFlee();
			}
	}
}
