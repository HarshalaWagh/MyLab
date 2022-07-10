package march22;

public class ArrayEx2 {

	public static void main(String[] args) {
		Object a[][]=new Object[3][2];
		
		a[0][0]=10;
		a[0][1]=20.5;
		
		a[1][0]='A';
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]="Welcome";
				
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
			System.out.print(a[i][j]+ "  ");
		    }System.out.println();
	    }

}
}
