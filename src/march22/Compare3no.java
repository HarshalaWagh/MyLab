package march22;

public class Compare3no {
	public static void main(String args[])
	{
		int a=30,b=70,c=45;
		if(a!=0&&b!=0&&c!=0)
		{
		
		if(a>b && a>c)
		{ 
			System.out.println("Highest no is a");
		}
		else if(b>a && b>c)
		{
			System.out.println("Highest no is b");
		}
		else if(c>a && c>b)
		{
			System.out.println("Highest no is c");
		}
		else
		{
			System.out.println("Same no");
		}
	}

}
}