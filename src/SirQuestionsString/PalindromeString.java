package SirQuestionsString;

public class PalindromeString {
	public static void main(String args[]) {
		String s="mavam";
		String org_s=s;
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(org_s.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		
		
		
	}
}
