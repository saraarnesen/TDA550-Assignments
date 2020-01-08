package Assignment3;

public class References {
	public static void main(String[] args) {
		stringRefs();
		integerRefs();
		/**
		 * Utskrift 1: s1 == s2 -> false s1.equals(s2) -> true
		 * Utskrift 2: s3 == s4 -> true s3.equals(s4) -> true
		 * Utskrift 3: s5 = s6 -> false s5.equals(s6) -> true
		 * Utskrift 4: i>=j, true
		 * Utskrift 5: i == j, false
		 * Utskrift 6: i == 2, true
		 */
	}

	private static void printIntegerEq(String exp, boolean b) {
		System.out.println(exp + " -> " + b);
	}

	private static void printStringIdEq(String aN, String bN, Object a, Object b) {
		System.out.println(aN + "==" + bN + " -> " + (a == b) + "\t" + aN + ".equals(" + bN + ") -> " + a.equals(b));
	}

	private static void stringRefs() {
		String s1 = new String("False");
		String s2 = new String("False");
		printStringIdEq("s1", "s2", s1, s2);
		String s3 = "True";
		String s4 = "Tr"+"ue";
		printStringIdEq("s3", "s4", s3, s4);
		String s5 = "False";
		String sx = "F";
		String s6 = sx + "alse";
		printStringIdEq("s5", "s6", s5, s6);
	}

	private static void integerRefs() {
		Integer i = new Integer(2);
		Integer j = new Integer(2); 
		printIntegerEq("i >= j", i >= j);
		printIntegerEq("i == j", (i == j));
		printIntegerEq("i == 2", i == 2);

	}
}
