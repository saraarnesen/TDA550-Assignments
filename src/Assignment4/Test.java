package Assignment4;

import java.util.SplittableRandom;

public class Test {
	public static void main(String[] args) {
		SplittableRandom r = new SplittableRandom(5);
		int[] arr = new int[7];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10) ; 
			System.out.println(arr[i]);
		}
		for (int j = 0 ; j < arr.length ; j++) {
			System.out.println("Här är res: " + "\n" + arr[j]);
		}
		for(int j : arr) {
			System.out.println(j);
		}

	}

}
