package march22;

public class nestedif {
	public static void main(String args[])
	{
		int marks=50;
		
		if(marks<=100)
		{
			if(marks>=90) {
			System.out.println("First Class");
			
		}
			else if(marks>=70) {
					System.out.println("Second Class");
				}
				else if(marks>=50)
					{
						System.out.println("Third Class");
				}
				else
				{
					System.out.println("Fail");
	
				}
			}
		}
	}