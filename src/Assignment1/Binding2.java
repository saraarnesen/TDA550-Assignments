package Assignment1;

public class Binding2 {
	public static void main(String[] args) {
		Base[] objs1 = new Base[] { new SubA(), new SubB(), new Base() };
		for (Base o : objs1) {
			Binding1.printValue(o);
			/*
			 * "That was a Base, subclassed by Assignment1.SubA: SubA!"
			 * "That was a Base, subclassed by Assignment1.SubB: SubB!"
			 * "That was a Base,not a strict subclass of Base: Base!"
			 */
		}
		
		SubA[] objs2 = new SubA[] { new SubA(), new SubB() };
		for (Base o : objs2) {
			Binding1.printValue(o);
			/* 
			 * That was a Base, subclassed by Assignment1.SubA: SubA!
			 * That was a Base, subclassed by Assignment1.SubB: SubB!
			 */
		}
		for (SubA o : objs2) {
			Binding1.printValue(o);
			/*
			 * This was a SubA: SubA!
			 * This was a SubA: SubB!
			 */
		}
	}
}