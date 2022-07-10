package Patterns;

public class Pattern2 {
  public static void main(String[] args)
		    {
		     
		        	int row = 6;
		        	for (int a=1; a<row; a++)
		        	{
		        	for (int b=row-a; b>0; b--)
		        	{
		        	System.out.print(" ");
		        	}
		        
		        	for (int b=1; b<=a; b++ )
		        	{
		        
		        	System.out.print(b  +" ");
		        	}
		        	System.out.println();
		        	}
		        	}
	
	}
	  