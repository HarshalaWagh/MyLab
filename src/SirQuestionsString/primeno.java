package SirQuestionsString;

public class primeno {
	public static void main(String args[]){ 
	    int a;
		for(int i=2;i<=20;i++)
		{
			a=0;
			for(int j=2;j<i;j++)
			{
				if(i % j == 0)
				{
					a++;
				}
					
			}if(a==0)
			{
				System.out.println(i);
			}
		}
	
	}
}
	