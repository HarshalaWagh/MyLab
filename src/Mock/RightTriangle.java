package Mock;

public class RightTriangle {
	public static void main(String[] args) {
		
		for(int a=1;a<=5;a++)	
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=5;a>=0;a--)
		{
			for(int b=1;b<a;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*int row	=6;
	for(int a=1;a<=row;a++)	
	{
		for(int b=1;b<=a;b++)
		{
			System.out.print(a);
		}
		System.out.println();
	}*/
	/*for(int a=5;a>=0;a--)
	{
		for(int b=0;b<a;b++)
		{
			System.out.print(a);
		}
		System.out.println();
	}*/
}


