package SirQuestionsString;

import java.util.Arrays;

public class Bubble_Sort {
	public static void main(String arrg[]) {
		int a[]= {1,67,21,12,79,56,43,75};
		
		for(int i=0;i<a.length-1;i++)//no of passes
       {
	    for(int j=0;j<a.length-1;j++)//Iteration in each pass
	    {
	    	if(a[j]>a[j+1]) {
	    		int temp=a[j];
	    		a[j]=a[j+1];
	    		a[j+1]=temp;
	    		
	    	}
       
        }
	
	}  System.out.println("Sorted arraylist is " +Arrays.toString(a));
	
}
}