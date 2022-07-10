 package SirQuestionsString;

public class HighestNumber_Array {
	  public static void main(String[] args) {  
		  
	        //Initialize array  
	        int arr[] = new int[] {25, 11,2,0, 7, 75, 56};  
	        
	        //Initialize max with first element of array.  
	        int max = arr[0];  
	        
	        //Loop through the array  
	        for (int i = 0; i < arr.length-1; i++) {  
	            //Compare elements of array with max 
	           if(arr[i] >max)  
	        	   max = arr[i];  
	        }  
	        System.out.println("Largest element present in given array: " + max);  
	    }    

}
