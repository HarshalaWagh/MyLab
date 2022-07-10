package CollectionFramework;

import java.util.Collections;
import java.util.HashSet;

public class HashSetExp1 {
public static void main(String[] args) {
	
	HashSet<String> hs=new HashSet<String>();
	
	hs.add("Nirobi");
	hs.add("Swapna");
	hs.add(null);
	hs.add(null);
	hs.add("Sandy");
	System.out.println(hs);

	System.out.println(hs.size());
	hs.add("123");
	
	System.out.println(hs);
	
}
}
