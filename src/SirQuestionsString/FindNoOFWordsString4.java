package SirQuestionsString;

public class FindNoOFWordsString4 {
	
	public static void main(String args[])
	{
		String s="My name is khan";
	 
    int count = 1;

    for (int i = 0; i <s.length() - 1; i++)
    {
        if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
        {
            count++;
        }
    }
    System.out.println("Number of words in a string : " + count);
}


}
