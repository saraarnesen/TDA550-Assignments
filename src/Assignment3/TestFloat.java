package Assignment3;

public class TestFloat {
	
	/**
	 * Equals ska uppfylla följande relationer:
	 * 1. Reflexivitet: a.equals(a)
	 * 2. Symmetri: a.equals(b) <=> b.equals(a)
	 * 3. Transitivitet: a.equals(b) ^ b.equals(c) => a.equals(c)
	 */

	public static void main (String[] args) {
		TolerantFloat f1 = new TolerantFloat(1f) ; 
		TolerantFloat f2 = new TolerantFloat(1.02f) ; 
		
		/**
		 * Är TolerantFloat.equals() reflexiv?
		 * Ja det borde den vara
		 */
		
		System.out.println(f1.equals(f1));
		
		/**
		 * Är TolerantFloat.equals() symmetrisk?
		 * Nej.
		 */
		Float f3= new Float(1.01f) ;
		
		System.out.println(f1.equals(f3));
		System.out.println(f3.equals(f1));
		
		/**
		 * Är TolerantFloat.equals() transitiv
		 */
		System.out.println(f1.equals(f1));
		System.out.println(f2.equals(f3));
		System.out.println(f3.equals(f1));

	

		
		
	}
}
