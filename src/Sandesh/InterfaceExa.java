package Sandesh;

interface TestInt
{
	int a=10;
	public void m1();
}

public class InterfaceExa implements TestInt {

	public void m1() {
	
		System.out.println(a);
	}
public static void main(String args[])
{    
TestInt obj=new InterfaceExa();
	obj.m1();
}
}
