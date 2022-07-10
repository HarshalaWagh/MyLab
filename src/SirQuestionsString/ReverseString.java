package SirQuestionsString;

public class ReverseString {
	
	public static void main(String arrgs[]) {
		String S="Java Concept Of The Day";
	
		System.out.println("Reverse String is");
	
		for(int i=S.length()-1;i>=0;i--)
		
		 { 
			System.out.print(S.charAt(i));
		}
		/*StringBuffer SB=new StringBuffer("Uwighjj");
		StringBuffer rev=SB.reverse();
		if(SB==rev) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
			*/
		
	}

}
