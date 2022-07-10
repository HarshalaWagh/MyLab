package Sandesh;

public class ExceptionHandling {
	
	public static void main(String args[]) {
		System.out.println("Program is started");
		/*int a=20;
		try{
			System.out.println(a/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		*/
		String s=null;
		try{
		System.out.println(s.length());
		}
	     catch(NullPointerException e) {
			System.out.println("String is empty");
		}
		finally {
		System.out.println("Program is in progress");
	}
	}

}

