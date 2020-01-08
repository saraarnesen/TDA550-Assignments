package Assignment3;

/**
 * @invariant getStart() is before or at the same time as getEnd()
 * @invariant getStart() consistently returns the same value after object creation
 * @invariant getEnd() consistently returns the same value after object creation
 */
import java.util.Date;

public final class Period {
	private final Date start;
	private final Date end;

/**
 * @param start the beginning of the period
 * @param end the end of the period
 * @pre start <= end
 * @post The time span of the returned period is positive.
 * @throws IllegalArgumentException if start is after end
 * @throws NullPointerException if start or end is null
 */
public Period(Date start, Date end) {
 if (start.compareTo(end) > 0) {
 throw new IllegalArgumentException(start + "after" + end);
 }
 this.start = new Date(start.getTime()) ; 
 this.end = new Date(end.getTime()) ; 
}

	public Date getStart() {
		return new Date(start.getTime()) ;
		
	}

	public Date getEnd() {
		return new Date(end.getTime()) ;

	}
	
	public static void main (String[] args) {
		Date start = new Date(699289235455L) ; 
		Date end = new Date(979467664554L) ; 
		System.out.println("Current date is " + start + " and end date is " + end);
		
		Period newPeriod = new Period(start, end) ;
		
		System.out.println(newPeriod.getStart() + " " + newPeriod.getEnd());
		
		newPeriod.getEnd().setYear(2000);
		
		System.out.println(newPeriod.getStart() + " " + newPeriod.getEnd());

		
	}
	/*
	 * Uppgift (A)
	 * Klassinvarianterna getStart() consistently returns the same value after object creation
	 * och getEnd() consistently returns the same value after object creation
	 * är tillför att klassen inte ska vara muterbar. Eftersom de ser till 
	 * att värdet för ett objekt är samma efter
	 * att objektets skapat tills objektet slutar att existera
	 * 
	 * Uppgift (B)
	 * 1. Typerna hos konstruktorns två parameterar är inte primitiva 
	 * eller icke-muterbara, vilket gör att kopior av objekten måste tas
	 * 2. I metoderna getStart() och getEnd() returneras referenser till
	 * Period-objektets privata Date-objekt. För att förhindra att utomstående
	 * kan ändra på dessa måste man ska kopior av objekten och returnera
	 * kopiornas referenser. 
	
	 */
}
