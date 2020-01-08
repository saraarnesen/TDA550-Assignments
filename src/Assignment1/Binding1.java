package Assignment1;

public class Binding1 {
	public static void printValue(SubA v) {
		System.out.println("This was a SubA: " + v.toString());
	}

	public static void printValue(SubB v) {
		System.out.println("This was a SubB: " + v.toString());
	}

	public static void printValue(Base v) {
		System.out.print("That was a Base");
		if (v.getClass() != Base.class) {
			System.out.print(", subclassed by " + v.getClass().getName() + ": ");
		} else {
			System.out.print(", not a strict subclass of Base." + ": ");
		}
		System.out.println(v.toString());
	}

	public static void main(String[] args) {
		Base spa = new Base(); //New base called spa
		SubA apa = new SubA(); // New SubA called apa
		SubB bepa = new SubB(); //New SubB called bepa
		Base apalt = apa; //Creating a new reference object apa, named apalt
		SubA bepalt = bepa; //Creating a new reference of object bepa, named bepalt
		
		printValue(spa); 
		//"That was a Base,not a strict subclass of Base: Base!"
		
		printValue(apa);
		//"This was a SubA: Sub A!" 
		
		printValue(bepa);
		//"This was a SubB: Sub B!" 

		printValue(apalt);
		//"That was a Base, subclassed by SubA: SubA!"
		printValue(bepalt);
		//"This was a SubA: Sub B!"
	}
}
