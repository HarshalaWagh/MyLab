package SirQuestionsString;

public class ReverseCharactersInWords {//wrong
	
	public static void main(String args[]) {
		String str="Java Concept of the Day";
		String rev="";
	
		for(int i=str.length()-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);
		}
		String arr[]=rev.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");	
	}

}
}
