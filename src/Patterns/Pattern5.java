package Patterns;

public class Pattern5 {
	public static void main(String arrg[]) {
		  int row = 5;
		  
		    for (int a = 0; a < row; a++) {
		      // print spaces
		      for (int b = 0; b < a; b++) {
		        System.out.print(" ");
		      }
		      // print number 
		      for(int c = 0; c < 2*(row - a) - 1; c++) {
		        System.out.print(c+1);
		      }
		      
		      System.out.println();
		    }
		  }
		


}
