package CollectionFramework;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorExp1 {
public static void main(String[] args) {
	Vector<Integer> ve=new Vector<Integer>();
	
	ve.add(100);
	ve.add(300);
	ve.add(90);
	ve.add(100);
	
	System.out.println(ve);
	
	//sort method is only applicable to list not set
	Collections.sort(ve);
	
	System.out.println(ve);
	ve.add(2,190);
	System.out.println(ve);
	System.out.println(ve.get(1));
	
	for(int i=0;i<=ve.size()-1;i++) {
		System.out.print(ve.get(i) +"  ");
	}
	System.out.println();
	
	for(Integer i:ve) {
		System.out.print(i +"  ");
	}
	System.out.println();
	
	Iterator<Integer> it=ve.iterator();
	while(it.hasNext()) {
		System.out.print(it.next() +"  ");
	}
	System.out.println();
	
}
}
