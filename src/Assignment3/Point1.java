package Assignment3;

public class Point1 implements Cloneable{
	private int x, y;

public Point1(int x, int y) {
 this.x = x;
 this.y = y;
}

protected Object clone() {
	try { return (Point1)super.clone() ;
	} catch (CloneNotSupportedException e) {
		throw new InternalError() ; 
	}
}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public String toString() {
		String str = null ; 
		str = Integer.toString(getX()) ;
		str = str + ", " + Integer.toString(getY()) ; 
		return str ; 
	}
}