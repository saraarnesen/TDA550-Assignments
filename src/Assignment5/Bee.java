package Assignment5;

import java.beans.PropertyChangeEvent;

public class Bee implements Observer{
	private final String name;

	public Bee(final String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;

	}

	@Override
	public void propertyChange(final PropertyChangeEvent evt) {
		if(evt.getSource() instanceof Flower) {
			((Flower)evt.getSource()).visit(this) ; 
		}
	
	}
}