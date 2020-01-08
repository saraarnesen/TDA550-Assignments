package Assignment1;

/*
 * Vad blir utdata när man kör main i klassen Vector
 *
 */

public class Vector {
	private int x;
	private int y;
	private int z;

	public Vector(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double norm() {
		return Math.sqrt(x * x + y * y + z * z);
	}

	public void add(Vector v) {
		x += v.x;
		y += v.y;
		z += v.z;
	}

	public void silly(int x, int y, int z) {
		this.x = ++x;
		this.y = y++;
		this.z += z;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public String toString() {
		return "Vector, <x = " + x + ", y = " + y + ", z = " + z + ">";
	}

	public static void main(String[] args) {
		Vector a = new Vector(1, 0, 0); //a.getX() = 1, a.getY() = 0, a.getZ() = 0
		Vector b = new Vector(0, 1, 0); //b.getX() = 0, b.getY() = 1, b.getZ() = 0
		Vector c = a; //Skapar en kopia av referensen till objektet a
		int x = 1; 
		int y = 2;
		int z = 3;
		a.add(b); 
		/*Lägger till värden från b till vektor a, 
		* a.getX() = 1, a.getY() = 1, a.getZ() = 0
		*/	
		b.add(b);
		/*Lägger till värden från b till vektor b,
		 * b.getX() = 0, b.getY() = 2, b.getZ() = 0
		 */
		c.add(c);
		/*
		 * Lägger till värden från c till vektor c, obs. a och c är referenser till 
		 * samma objekt, så: 
		 * a.getX() = 2, a.getY() = 2, a.getZ() = 0
		 */
		c.silly(x, y, z);
		/* Nya x = (1 + 1) = 2 och int x = 1
		 * Nya y = 2   och int y = 2
		 * Nya z är 0 + 3 = 3 och int z = 3
		 * a.getX() = 2, a.getY() = 2, a.getZ() = 3

		 */
		System.out.println("a: " + a); // a = (2,2,3)
		System.out.println("b: " + b); // b = (0,2,0)
		System.out.println("c: " + c); // c = (2,2,3)
		System.out.println("x: " + x + "\ty: " + y + "\tz: " + z); //(1,2,3)
	}

}
