package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExp1 {

	public static void main(String[] args) {
		
			ArrayList<Object> al=new ArrayList<Object>();
			
			al.add("Tina");
			al.add(12345);
			al.add(null);
			al.add('c');
			
			System.out.println(al);
			System.out.println(al.contains('c'));
			
			al.set(0, "Sandesh");
			System.out.println(al.get(0));
			System.out.println(al);
			
			al.add(0,"UMIKA");
			System.out.println(al);
			
			System.out.println(al.size());
			System.out.println(al.isEmpty());
			
			al.remove(0);
			System.out.println(al);
			
			//By using normal normal for loop
			for(int i=0;i<=al.size()-1;i++) {
				System.out.println(al.get(i));
			}
			
			//By using For each loop
			for(Object obj:al) {
				System.out.println(obj);
			}
			
			//By using iterator interface
			Iterator it=al.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
	
	}
}
