package Assignment4;

import java.util.HashSet;
import java.util.Set;

public class Uppgift3 {

	public static <T>Set<T> exclusiveUnion (Set<T> s1, Set<T> s2) {
	final Set<T> union = new HashSet<>(s1) ; 
	//Skapar union av s1 och s2
	union.addAll(s2) ; 
	
	final Set<T> intersection = new HashSet<>(s1) ; 
	/*Behåller bara de element i intersection som också
	 * finns i s2
	 */
	intersection.retainAll(s2) ;
	
	//Ta bort snittets element från unionen
	union.removeAll(intersection) ;
	return union ; 
	}
	
}
