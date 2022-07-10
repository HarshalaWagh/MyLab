package Sandesh;

public class MO {
	int a,b;
	public void sum() //Methods without parameters
	{
		a=20;
		b=50;
		System.out.println(a+b);
	}
	public void sum(int x,int y) //Methods without parameters
	{    
		 a=x;
		 b=y;
		System.out.println(a+b);
	}
	public void sum(int x,double y) //Methods with parameters
	{
		System.out.println(x+y);
	}
	public void sum(int x,int y,int z) //Methods with parameters
	{
	
		System.out.println(x+y+z);
	}
	public static void main(String args[])
	{
		MO obj=new MO();
		obj.sum();
		obj.sum(100,200);
		obj.sum(100,150,421);
		obj.sum(220,15.08);
		
	}	

}
