
package SirQuestionsString;

public class ArmstrongNo {
	 public static void main(String[] args)
	    {
	int num=153;
	int temp=num;
	int r,result=0;
	while(num>0)//153!=0
	{
		r=num%10;//153%10=3     15%10=5    1%10=1
		num=num/10;//153/10=15   15/10=1    1/10=0
		result=result+(r*r*r);
	}
	if(temp==result)
	{
		System.out.println("No. is Amstrong");
	
	}
	else
	{
		System.out.println("No. is not Amstrong");
	}
	
	}
		        
}