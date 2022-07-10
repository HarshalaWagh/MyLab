package Patterns;

public class Pattern6 {
	public static void main(String[] args)   
	{            
            int a, b, c = 1;
            //outer loop
            for (a = 1; a <= 5; a++) {
            	//inner loop
                for (b = 1; b< a + 1; b++) {
                    System.out.print(c++ + " ");
                }
       
                System.out.println();
            }
        }
       
    }
