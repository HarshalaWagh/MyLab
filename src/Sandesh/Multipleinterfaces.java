package Sandesh;

interface A
{
	int a=10;
	public void M1();

}
interface B
{
	int b=100;
	public void M2();

}

public class Multipleinterfaces implements A,B
{

	public void M1() {
		System.out.println(a);
		
	}
	public void M2() {
	System.out.println(b);
	}
	public static void main(String args[])
	{
		Multipleinterfaces obj=new Multipleinterfaces();
		obj.M1();
		obj.M2();
	}

}


