		package march22;

public class String1 {

	public static void main(String args[]) {
		//Length
		String s="Welcome";
		System.out.println(s.length());
		
		String s1="Tri";
		String s2="angle";
		//Concat
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println("Tri"+"angle");
		System.out.println("Tri"+"angle");
		
		//Equal
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		//EqualsIgnoreCase
		String s3="Tri";
		String s4="tri";
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//Contains
		 System.out.println(s.contains("XYZ"));
		 
		 //Substring
		 System.out.println(s.substring(0,5));
		 
		 //Replace
		 System.out.println(s.replace('e', 'a'));
		 System.out.println(s.replace("Welcome","BYE"));
		 
		
		 
		
		
	}
}
