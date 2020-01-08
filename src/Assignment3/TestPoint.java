package Assignment3;

public class TestPoint {
	
	/**
	 * Equals ska uppfylla följande relationer:
	 * 1. Reflexivitet: a.equals(a)
	 * 2. Symmetri: a.equals(b) <=> b.equals(a)
	 * 3. Transitivitet: a.equals(b) ^ b.equals(c) => a.equals(c)
	 */

	public static void main (String[] args) {
		Point p1 = new Point (4,8) ; 
		Point p2 = new Point (4,8) ; 
		Point p3 = new Point (4,8) ; 


		NamedPoint p1name = new NamedPoint (4,8,"Hej") ; 
		NamedPoint p2name = new NamedPoint (4,8,"Hejdå") ; 

		/**
		 * Alla kriterierna för equals-metoden följs utav 
		 * Point klassen.
		 */
		
		System.out.println(p1.equals(p1));
		
		System.out.println(p1.equals(p2) + " och " +
		p2.equals(p1));
		
		System.out.println(p1.equals(p2) + " och " + p2.equals(p3)
		+ " och " + p3.equals(p1));
		
		/**
		 * Reflexivitet gäller för NamedPoint klassen
		 */
		System.out.println(p1name.equals(p1name));	 
		
		/**
		 * Symmetri gäller för NamedPoint klassen
		 * Man testar i equals metoden om det objekt som är 
		 * aktuellt är en NamedPoint eller en Point, är det
		 * en Point använder man equals för Point när man 
		 * jämför med en NamedPoint
		 */
		
		System.out.println(p1name.equals(p1));
		System.out.println(p1.equals(p1name));
		
		/**
		 * Transitiviteten gäller inte. Se exempel.
		 */
		
		System.out.println(p1name.equals(p1) + " " + p1.equals(p2name) +
				" " + p2name.equals(p1name)) ;
		
		/**
		 * LSP uppfylls inte om man inte tillåter jämförelse mellan 
		 * samma subklasser. Men samtidigt så bryts equals-kontraktet
		 * om man använder sig av instanceOf istället för .getClass
		 */
	}
}
