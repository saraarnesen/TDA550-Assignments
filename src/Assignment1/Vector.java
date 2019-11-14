package Assignment1;

//Test

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
		public int getX() { return x; }
		public int getY() { return y; }
		public int getZ() { return z; }
		public String toString() {
		return "Vector, <x = " + x + ", y = " + y + ", z = " + z + ">";
		}
		public static void main(String[ ] args) {
		Vector a = new Vector(1, 0, 0);
		Vector b = new Vector(0, 1, 0);
		Vector c = a;
		int x = 1;
		int y = 2;
		int z = 3;
		a.add(b);
		b.add(b);
		c.add(c);
		c.silly(x, y, z);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("x: " + x + "\ty: " + y + "\tz: " + z);
		}
		
}
