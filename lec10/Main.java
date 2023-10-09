import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
		
	list.add(0, "roses");
	list.add(1, "are");
	list.add(2, "red");
		
	System.out.println(list); 

	Iterator<String> iter = list.iterator();
	while(iter.hasNext()) {
	    String s = iter.next();
	    System.out.println(s);
	}
	// run to show exception
	//System.out.println(iter.next());
		
	for(Iterator<String> iter2 = list.iterator(); iter2.hasNext(); ) {
	    System.out.println(iter2.next());
	}
    }
}
