package Assignment5;

import java.beans.PropertyChangeSupport;

public class Flower implements Observable {
	private final String name;
	private final PropertyChangeSupport obs; 

	public Flower(final String name) {
		this.name = name;
		this.obs = new PropertyChangeSupport(this) ; 
	}

	public void visit(Bee b) {
		System.out.println(this.name + " is beeing visited by " + b.getName());
	}

	public void bloom() {
		System.out.println(name + " is blooming!");
		this.obs.firePropertyChange("blooming", false, true) ; 
	}
	
	@Override
	public void addObserver(Observer obs) {
			this.obs.addPropertyChangeListener(obs); 
		
	}
	@Override
	public void removeObserver(Observer obs) {
			this.obs.removePropertyChangeListener(obs) ;
		
	}



	
	
}