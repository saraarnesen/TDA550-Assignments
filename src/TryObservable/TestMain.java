package TryObservable;

public class TestMain {

	public static void main(String[] args) {
		Cat cat = new Cat("Ramses") ;
		Mouse mouse1 = new Mouse("Pelle") ;
		Mouse mouse2 = new Mouse("Maria") ; 
		
		cat.addObserver(mouse1);	
		cat.giveMiceCheese(mouse1);
		cat.removeObserver(mouse1);
	
		
	}

}
