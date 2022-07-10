package NonPrimitiveDatatype;

public class Array1 {

	public static void main(String[] args) {
		int d[]= {10,20,30,100,50,60};
		String s[]= {"Umika","Harshala","Sandesh"};
		String z="I am Umika";
		String T="Umika is very brilliant girl";
		
		int count=0;{
			
		
		for(int i=0;i<=T.length()-1;i++) {
			if(T.charAt(i)==' ') 
			{
				count++;
				
			}
			System.out.println("No of white spaces in string is "+count);
		}
		}
		
		for(int j=z.length()-1;j>=0;j--)
	         System.out.print(z.charAt(j)+ "  ");
		System.out.println();
		
		int L1=s.length;
		System.out.println(d[2]);
		System.out.println(L1);
		 
		int b[]=new int[] {10,50,30,60,90};//Declaring array using new keyword
		
		int c[]=new int[5];
		c[0]=25;
		c[1]=35;
		c[2]=55;
		
		
		String Value=s[1];
		int L2=Value.length();
		//System.out.println(Value.charAt(2));//3rd place character in Harshala
		System.out.println(L2);
		for(int i=L2-1;i>=0;i--)
	         System.out.print(Value.charAt(i)+ "  ");
		
		/*System.out.println("Original Array printed in reverse order:");
         for(int i=L1-1;i>=0;i--)
         System.out.print(s[i] + "  ");*/

	}

		/* int space=0;
	   int s1=z.length();{
	   System.out.println(s1);}
	for(int j=0; j<=s1.length(); j++)
	   {
	   char ch=str.charAt(j);
	    if(ch==' '){
	           space++;
	       }
	   }
	   System.out.println("Total white space : "+space);
	   }
	   }*/
		
		
}
	

	
		

	


