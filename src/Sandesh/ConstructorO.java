package Sandesh;

public class ConstructorO{
	int a,b;
	double c;
	
	public ConstructorO()
	{
		 a=20;
		 b=10;
		 c=50.5;
	}
	public ConstructorO(int x,int y)
	{
	 a=x;
	 b=y;
	}
	public ConstructorO(int x,int y,double z)
	{
		 a=x;
		 b=y;
		 c=z;
	}
	public ConstructorO(double x,int y,int z)
	
	{a=z;
	b=y;
	c=x;	
	}
	public void values()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String args[])
	{
		ConstructorO obj=new ConstructorO();
		ConstructorO obj1=new ConstructorO(100,200);
		ConstructorO obj2=new ConstructorO(100,20,15.5);
		obj.values();
		obj1.values();
		obj2.values();
		
	}

}
