package SirQuestionsString;

public class RemoveWhiteSpaces {
	 public static void main(String[] args) {
	        String s = "T    his  i s My  J  ob";
	        System.out.println("Original sentence: " + s);

	        s= s.replaceAll("\\s", "");
	        System.out.println("After replacement: " + s);
	    }

}
