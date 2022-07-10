package march22;

public class String2 {
	public static void main(String arrgs[]) {
		String S="Welcome";
		String U="Welcome";
		String T=new String(" In India");
		String N1=new String("First");
		String N2=new String("Welcome");
		System.out.println(N1.equalsIgnoreCase(N2));
		if(S==U) {
			System.out.println("Strings are equals");	
		}else {
			System.out.println("Strings are not equals");
		}
		
		N2.concat(" To India");
		System.out.println(N2);
		
		if(S.equals(N2)) {
			System.out.println("Strings are equals");	
		}else {
			System.out.println("Strings are not equals");
		}
		//Length of String 
		System.out.println("Length of the S string"  +S.length());
		System.out.println("Length of the  U string" +U.length());
		
		//Character at given index no
		System.out.println("Character at 3rd place "   +S.charAt(4));
		
		//Convert string into Uppercase
		System.out.println(S.toUpperCase());
		
		//Convert string into Lowercase
		System.out.println(S.toLowerCase());
		
		//Equals to
		System.out.println(S.equals(T));
		System.out.println("Welcome"=="In India");
		System.out.println(S==T);
		
		//EqualIgnoreCase
		System.out.println(S.equalsIgnoreCase(U));
		
		//Cobine 2 Strings
		System.out.println(S.concat(T));
		
		//Contains
		System.out.println(S.contains("come"));
		
		//Make substring from given string
		System.out.println("Sub string is "+S.substring(3));
		
           //Print String
		//1
		System.out.println(S);
			//2
		for(int i=0;i<=S.length()-1;i++)
			
			 { 
				System.out.print(S.charAt(i));
			}System.out.println();
			
		
		 //Print reverse String
			for(int i=S.length()-1;i>=0;i--)
			{
				System.out.println(S.charAt(i));
			}
			
	     //Replace given string with another string
			System.out.println(S.replace("Welcome","Welkommen"));	
			
			
		
	}
}
