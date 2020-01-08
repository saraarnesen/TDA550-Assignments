package Assignment1;

public class RefvalMain {
	
	public static void simpleSwap(Integer x, Integer y) {
		Integer temp = x;
		x = y;
		y = temp;
	}

	public static void valueHolderSwap(ValueHolder vh1, ValueHolder vh2) {
		Integer tmp = vh1.value;
		vh1.value = vh2.value;
		vh2.value = tmp;
	}

	public static void valueHolderSwap2(ValueHolder v1, ValueHolder v2) {
		v1 = new ValueHolder(v2.value);
		v2 = new ValueHolder(v1.value);
	}

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		simpleSwap(a, b);
		/*
		 * Sätter temp = 1
		 * Sätter a = b = 2
		 * Sätter b = 1 
		 * Sparar inte variablerna någonstans
		 */
		
		//a = 1 och b = 2
		System.out.println("a= " + a + " b= " + b);
		
		/*
		 * Sätter c = 1 
		 * Sätter d = 2 
		 */
		Integer c = new Integer(1);
		Integer d = new Integer(2);
		//Byter ut c mot d men sparar inte variablerna 
		simpleSwap(c, d);
		
		// c = 1 och d = 2 eftersom variablerna inte sparas
		System.out.println("c= " + c + " d= " + d);
		
		/*
		 * Skapar v1 med värde 1
		 * Skapar v2 med värde 2 
		 */
		ValueHolder v1 = new ValueHolder(1);
		ValueHolder v2 = new ValueHolder(2);
	
		// Byter plats så a har värde 2 och b värde 1
		valueHolderSwap(v1, v2);
		System.out.println("a= " + v1.value + " b= " + v2.value);
		// Ändrar inte våra instansvariabler så a har värde 2 och b värde 1
		valueHolderSwap2(v1, v2);
		System.out.println("a= " + v1.value + " b= " + v2.value);
	}
}
