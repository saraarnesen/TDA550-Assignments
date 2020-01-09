package TryObservable;

import java.beans.PropertyChangeSupport;
import java.util.Random;

public class Cat implements Observable {

	private static int miceKilled = 0;
	private String name;
	private final PropertyChangeSupport obs;
	private boolean mouseHunted = false ;

	public Cat(String name) {
		this.name = name;
		this.obs = new PropertyChangeSupport(this);
	}
	/**
	 * Returns the private variabel name
	 * @return name of object of type Cat
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * @return number of mice killed
	 */
	public static int getMicecCatched() {
		return miceKilled;
	}
	/**
	 * Sets name of the object
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	public boolean mouseHunted() {
		return mouseHunted ; 
	}

	public void huntMice(Mouse mouse) {
		System.out.println("Mouse " + mouse.getName() + " is hunted by Cat " + this.name);
		mouseHunted = true ; 
	}
	public void killerCat() {
		if(miceKilled>=2) {
			this.setName("Killer Cat");
			System.out.println("Cat killed many mice, recieves new name: " + this.getName());
		}
	}
	
	public void killMice(Mouse mouse) {
		miceKilled++;
		System.out.println(this.name + " has killed " + mouse.getName() + " which is kill number: " + getMicecCatched());
		this.obs.firePropertyChange("kills", 0, 2);
	}
	public void mouseFlee() {
		System.out.println("Mouse fled and survived ");
	}

	public void giveMiceCheese(Mouse mouse) {
		System.out.println("Cat " + this.getName() + " gives mouse " + mouse.getName() + " cheese");
		Random r = new Random();
		int res = r.nextInt(10);
		mouse.setCheese(res);
		this.obs.firePropertyChange("giveMiceCheese", true, false);
	}

	@Override
	public void addObserver(Observer obs) {
		this.obs.addPropertyChangeListener(obs);

	}

	@Override
	public void removeObserver(Observer obs) {
		this.obs.removePropertyChangeListener(obs);

	}
}
