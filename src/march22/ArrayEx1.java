package march22;

public class ArrayEx1 {

	public static void main(String[] args) {
	int a[]=new int[5];
	
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;

	System.out.println(a.length);
	
	//int sum=0;
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
		//sum=sum+a[i];

	}
	//System.out.println(sum);
	/*for(int i:a)
	{
		System.out.println(i);
		sum=sum+i;
		
		};
	}*/
	
	}
}
