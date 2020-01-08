package Assignment4;

import java.util.*;

public class DummyDates implements Iterable<Date> {
	private final static int SIZE = 15;
	private Date[] dates = new Date[SIZE];
	private int actualSize;

	public DummyDates() {
		SplittableRandom r = new SplittableRandom(1);
		for (int i = 0; i < SIZE; i++) { // Fill the array. . . .
			dates[i] = new Date(r.nextInt());
		}
		actualSize = SIZE;
	}

	public Iterator<Date> iterator() {
		return new DSIterator();
	}

	private class DSIterator implements Iterator<Date> {
		private int next = 0; // Start stepping through the array from the beginning
		private boolean nextCalled = false ;
	
		public boolean hasNext() {
			return (next < actualSize); // Check if current is the last element
		}
		/**
		 * @pre hasNext() is true
		 */
		
		public Date next() {
			if(hasNext()) {
				nextCalled = true ; 		
			return dates[next++];
			}
			else
			throw new NoSuchElementException() ; 
		}

		public void remove() {
			if(!nextCalled) {
				throw new IllegalStateException() ; 
			}
			for (int i = next; i < actualSize-1 ; i++) {
				dates[i] = dates[i + 1];
			}
			dates[SIZE - 1] = null ; 
			actualSize -- ; 
			nextCalled = false ;
		}
	}
}