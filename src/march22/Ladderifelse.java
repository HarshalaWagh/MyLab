package march22;

public class Ladderifelse {
	public static void main(String args[])
	{
		int marks=30;
		
		if(marks<=100 && marks>0)
		{
			
		   if(marks>=90)
		  {
			System.out.println("First Class");
		  }
			else if(marks>=70)
			{
					System.out.println("Second Class");
			}
			else if(marks>=50)
			{
				     System.out.println("Third Class");
			}
			    else if(marks<=30)
				{
					System.out.println("Fail");
				}
		   else
		   {
			   System.out.println("Invalid Input");
		   }
			   
		}
	}
	
}