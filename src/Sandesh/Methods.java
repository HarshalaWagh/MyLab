package Sandesh;

public class Methods {
	int a,b;
	/*Method donot take the parameters 
	public void sum()
	{
		System.out.println(a+b);
	}*/
	
	/*Method take the parameters 
	public void sum(int x,int y)
	{ a=x;
	b=y;
	
		System.out.println(a+b);
	}*/
	//Method return some value
	public int sum()
	{
	return(a+b);
	}
	public static void main(String args[])
	{
		Methods obj=new Methods();
		/*obj.a=100;
		obj.b=200;
		obj.sum();*/
		
		//obj.sum(100,200);
		
		obj.a=100;
		obj.b=200;
		int r=obj.sum();
		System.out.println(r);
		
		
	}

}
