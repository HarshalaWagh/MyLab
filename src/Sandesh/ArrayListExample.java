package Sandesh;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String arrgs[]) {
		ArrayList<String> list=new ArrayList<String>();
		 
		//Adding elements in arraylist
		list.add("Umika");
		list.add("Saka");
		list.add("Ruta");
		list.add("Vedika");
		list.add("Tina");
		
		System.out.println(list.size());//Return no elements in array
		for(String s:list)//reading elements from arraylist
		{
			System.out.println(s);
		}
		list.add("Ritika");
		System.out.println(list.size());
		
	
	 }

}
