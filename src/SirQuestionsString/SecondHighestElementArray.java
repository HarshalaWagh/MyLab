package SirQuestionsString;

public class SecondHighestElementArray {
	
	public static void main(String args[]) {
		
		int a[]=new int[] {23,18,87,65,45,12,10};
		int max=0;//if zero is present in array then use Integer.MIN_VALUE
		int secmax=0;//if zero is present in array then use Integer.MIN_VALUE
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) 
			{
				max=a[i];
		    }
			else if(a[i]>secmax) {
				secmax=a[i];
			}
		
	}
		System.out.println(secmax);
}
}
