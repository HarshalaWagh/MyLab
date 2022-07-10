package InheritancePack;

public class BaseClass {

	//Overloaded main() method 1   
	public static void main(boolean args)   
	{   
	   
	System.out.println("First overloaded main() method executed");   
	  
	}   
	//Overloaded main method 2   
	public static void main(String str)   
	{   
	System.out.println("Second overloaded main() method executed");   
	 
	}   
	//Overloaded main method 3   
	public static void main(int args)   
	{   
	System.out.println("Third overloaded main() method executed");   
	   
	}   
	//Original main() method  
	public static void main(String[] args)   
	{   
	System.out.println("Original main() method executed");   
	System.out.println("Hello");   
	//invoking overloaded main() method 1   
	BaseClass.main(true);   
	//invoking overloaded main() method 2  
	BaseClass.main("mango");  
	//invoking overloaded main() method 3   
	BaseClass.main(112);   
	}   
	}  


