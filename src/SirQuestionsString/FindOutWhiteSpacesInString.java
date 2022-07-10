package SirQuestionsString;

public class FindOutWhiteSpacesInString {
	
	//Using For loop
	public static void main(String args[]){
	    String str="My name is Khan";
	int count=0;

	for(int i=0; i<=str.length()-1; i++)
	{
	 if(str.charAt(i)==' ')
	 {
	        count++;
	    }
	}
	System.out.println("Total white space : "+count);	
	}
	}
	
	//Using do while Loop
	/*public static void main(String args[]) {
		  String str="My Name is Umika";
		  int space=0;
		      
		  int i=0; 
		  {
		  do{
		  char ch=str.charAt(i);
		   if(ch==' ')
		   {
		          space++;
		      }
		       i++;
		  }
		  while(i<str.length());
		  System.out.println("Total white space : "+space);
		  }
		  
	}

	}*/
