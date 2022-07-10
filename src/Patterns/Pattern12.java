package Patterns;

public class Pattern12 {
public static void main(String arrg[]) {
	int row=5;
    for (int a = 1; a <= row; a++) 
    {
    	for (int b=row-a; b>0; b--)
	{
	System.out.print(" ");
	}
        for (int b = 1; b <= a; b++)
        {
            if(b%2 == 0)
            {
                System.out.print(0 +" ");
            }
            else
            {
                System.out.print(1 +" ");
            }
        }
         
        System.out.println();
    }
     
}
}
