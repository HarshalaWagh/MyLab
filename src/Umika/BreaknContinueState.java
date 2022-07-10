package Umika;

public class BreaknContinueState {

	public static void main(String[] args) {
	for(int i=1;i<=10;i++) 
	{
		if(i==5)
		{	break;}
		System.out.println(i);
	}

		for(int i=1;i<=10;i++) 
		{
			if(i==5)
			{	continue;}//jump to next or skip mentioned stage
			System.out.println(i);
		}
		/*for(int i=1;i<=10;i++) 
		{
			if(i==5||i==7||i==9)
			{	continue;}//jump to next or skip mentioned stage
			System.out.println(i);
		}*/
		
	}

}
