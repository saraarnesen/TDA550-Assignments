package Assignment3;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Polygon implements Cloneable {

	private ArrayList<Point1> points;
	private int noOfPoints;
	
	public Polygon(int noOfPoints, ArrayList<Point1> points) {
		this.noOfPoints = noOfPoints ; 
		this.points = points ; 
	}
	
	public void setArrPoints() {
		for(int i = 0; i<points.size() ; i++ ) {
			points.get(i).setX((int)((Math.random()+1)*((i+1)*(i+2))));
			points.get(i).setY((int)((Math.random()+1)*((i+1)*(i+1))));

		}
	}

	protected Polygon clone() {
			try {
				Polygon pCopy = (Polygon)super.clone() ; 
				
				ArrayList<Point1> pointsClone = new ArrayList<>() ;
				Iterator<Point1> it = points.iterator() ;
				while(it.hasNext()) {
					pointsClone.add((Point1)it.next().clone()) ; 
				}
				return pCopy ; 
			}
			catch (CloneNotSupportedException e) {
			throw new InternalError() ; 
			}			
		}
	
	@Override
	public String toString() {
		String str = "" ; 
		for(int i = 0; i<points.size(); i++) {
			 str = str + ("Point number " + Integer.toString(i) + " has coordinates (" + points.get(i).toString() +")\n" ); 
		}
		return str;
	}

}
