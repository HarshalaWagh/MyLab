package march22;

public class array {
	
	public static void main(String[] args) {
		
		int a[][]={{10,20,50},{30,40,89},{50,60,27}};
	      //Classic for loop
	      
	      /*for(int i=0;i<=2;i++)
	      {
	    	  for(int j=0;j<=1;j++)
	    	  {
	    		  System.out.print(a[i][j]+" ");
	    	  }System.out.println();
	      }*/
	      //for each loop
	      for(int i[]:a)
	      {
	    	  for(int j:i)
	    	  {
	    		  System.out.print(j +"  ");
	    	  }System.out.println();
	      }
	      
		}
	}
	 

