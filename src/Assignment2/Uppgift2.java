package Assignment2;

public class Uppgift2 {
	// Uppgift 2a
	/**
	* @pre a!=null and a.length() >= n > 0
	* @post none
	* @returns returns the mean of the first n numbers in a
	**/
	public static double mean (int[] a, int n) {
	double sum = 0;
	for (int i = 0; i < n; i++) {
	sum = sum + a[i];
	}
	return sum / n;
	}
	//Testing
	public static void main (String[] args) {
		int[] a = new int[] {2, 3 ,4} ; 
		System.out.println(mean(a,2));
	} 
}

//Uppgift 2b
/*
 * 1. En tom sträng, som inte innehåller tecken
 * 2. Eller en sträng med samma frekvens på flera characters
 */
