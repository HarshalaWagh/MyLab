package SirQuestionsString;

public class FindUppercaseLetters {

	 public static void main(String[] args) {
	        
	        
	  String str= "Print UpperCase Letters in Java";
	 
	    for (int i = 0; i < str.length()-1; i++) {
	    
	            if(Character.isUpperCase(str.charAt(i))){    
	            System.out.println(str.charAt(i));
	            }
	            
	}
	 
	}

}
