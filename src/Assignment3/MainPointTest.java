package Assignment3;

import java.util.ArrayList;

public class MainPointTest {
	private static ArrayList<Point1> points = new ArrayList<>() ; 

	
	public static void main (String [] args) {
		int noOfPoints = 5 ; 

		for(int i = 0 ; i < noOfPoints ; i++) {
			Point1 temp = new Point1(i,i*2) ; 
			points.add(temp) ; 
		}
		Polygon p = new Polygon(noOfPoints, points) ; 
		System.out.println("Original Polygon p\n" + p) ; 
		
		Polygon pcopy = p.clone() ; 
		
		System.out.println("Polygon pcopy after cloning\n" + pcopy);
		
		pcopy.setArrPoints();
		System.out.println("Polygon pcopy after change\n" + pcopy);
		System.out.println("Polygon p after clone changed (should be the same)\n" + p);
		
		
		
	}

}
