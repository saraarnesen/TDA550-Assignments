package Assignment1;

public class Casting1 {
	public static void main(String[ ] args) {
		final long PARSEC = (long) 30587 * 1000000000 * 1000;
		final long M_PER_KM = 1000;
		int x = Integer.MAX_VALUE ; 
		int y = Integer.MIN_VALUE ; 
		System.out.println("Min value " + x + "Max value " + y);
		System.out.println(PARSEC);
		System.out.println(PARSEC / M_PER_KM);
		}

	/*
	 * Svaret som fås är -440487.
	 *
	 * Orsaken är att varje *enskild* heltalsliteral är av typen int om inget
	 * annat anges explicit. Likaså är resultatet av en multiplikation av två ints
	 * också en int.
	 * Om ett värde eller beräkningsresultat inte passar i en int "slår det runt".
	 * Minvärdet och maxvärdet för en int är -2^{31} = -2147483648 respektive
	 * 2^{31} - 1 = 2147483647. Dessa värden nås för övrigt även via konstanterna
	 * Integer.MAX_VALUE respektive Integer.MIN_VALUE.
	 *
	 * Det gäller alltså att uttrycket 2147483647 + 1 blir -2147483648 och uttrycket
	 * -2147483648 - 1 blir 2147483647.
	 *
	 * Problemet löses enkelt genom observationen att multiplikation av en long
	 * och en int får typen long. Genom att använda någon av följande formuleringar
	 * garanterar vi att typen av hela deluttrycket blir en long:
	 * final long PARSEC = 30587L * 1000000000 * 1000; // Notera L efter den första
	 *                                                    faktorn.
	 * final long PARSEC = (long) 30587 * 1000000000 * 1000; // Explicit typomvandling.
	 *
	 * Kapitel 4.2 i The Java Language specification beskriver storleken hos de
	 * primitiva typerna i Java:
	 * https://docs.oracle.com/javase/specs/jls/se13/html/jls-4.html#jls-4.2
	 */
}
