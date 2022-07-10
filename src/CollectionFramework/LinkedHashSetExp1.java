package CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetExp1 {

	public static void main(String[] args) {
		
	
	LinkedHashSet ls=new LinkedHashSet();
	ls.add(200);
	ls.add("Dipamala");
	ls.add('g');
	ls.add(null);
	
	System.out.println(ls);
	System.out.println(ls.size());
	System.out.println(ls.contains('g'));
	System.out.println(ls.isEmpty());
	
	ls.add("Seema");
	System.out.println(ls);
	

}
}
