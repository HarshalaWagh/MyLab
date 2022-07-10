package InheritancePack;

public class MethodOverloading {

	public void T1() 
	{
		System.out.println("I am method");
	}
	public void T2(int x) 
	{
		System.out.println(x);
	}
	public void T3(float g,String s) 
	{
		System.out.println(g  +s);
	}
	public static void main(String arrg[])
	{ MethodOverloading obj=new MethodOverloading();
	obj.T1();
	obj.T2(12);
	obj.T3(12.8f,"power");
	
		
	}
}
