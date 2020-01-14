
public class IteratorDP {
	
	public static void listElements(Iterator i) {
		for(Object k = i.getFirst(); !i.atEnd(); k = i.getNext()) {
			System.out.println(k);		
		}
	}
	
	public static void main(String[] args) {
		Iterator it = new ArrayListIterator();
		listElements(it);
		
		it = new ArrayIterator(20);
		listElements(it);
		
	}

}
