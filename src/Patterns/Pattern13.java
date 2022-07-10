package Patterns;

public class Pattern13 {
	public static void main(String arrg[]) {
		int row=5;
		   for (int a = 1; a <= row; a++) 
	        {
	            int num = a;
	             
	            for (int b = 1; b <= a; b++) 
	            {  
	                System.out.print(num+" ");
	                 
	                num = num+row-b;
	            }
	             
	            System.out.println();
	        }
	     
	}

}
