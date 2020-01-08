package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class Gang {
	private List<Creature> members;

	public Gang() {
		members = new ArrayList<Creature>();
	}

	public void add(Creature m) {
		members.add(m);
	}

	public boolean remove(Creature m) {
		return members.remove(m);
	}

	public int damageSum() {
		int total = 0;
		for (Creature c : members) {
			if (c != null) {
				total += c.doDamage();
			}
		}
		return total;
	}

	public static void main(String[] args) {
		Gang gang = new Gang();
		gang.add(new Spider("Spicy Spider"));
		gang.add(new Goblin("Greasy Goblin"));
		gang.add(new Snake("Sour Serpent"));
		System.out.println("Collective damage: " + gang.damageSum());
	}
}
