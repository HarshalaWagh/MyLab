package SirQuestionsString;
import java.util.Arrays;
public class Merge2Arrays {
	    
	public static void main(String[] args)   
	{  
	int[] a1 = {23,45,12,78,4,90,1};        //source array  
	int[] a2 = {77,11,45,88,32,56,3};  //destination array  
	int a1l = a1.length;        //determines length of firstArray  
	int a2l = a2.length;   //determines length of secondArray  
	int result[]= new int[a1l + a2l];  //resultant array of size first array and second array  
	System.arraycopy(a1, 0, result, 0, a1l);  
	System.arraycopy(a2, 0, result, a1l, a2l);  
	System.out.println(Arrays.toString(result));    //prints the resultant array  
	}  
	 
}
