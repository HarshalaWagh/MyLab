package Sandesh;

final class Test{
	
	final int a=10;
	public final void method1()
	{
	   // a=20;Not valid becoz a is final
		System.out.println(a);
	}
}
class Test1 extends Test//cannot extend the class because Test class is final
{
	
	/*public void method1()//Cannot override becoz method is final
	 *  {
		
		System.out.println("I am first");
	}*/
}

public class FinalExample {

}
