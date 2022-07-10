package SirQuestionsString;

public class CountChrsLowerAndUpperCases {

	public static void main(String args[]) {
  String str="mY name is Pepper";
    int upper=0,lower=0;//variable declaration and initialization
    
   System.out.println("Given String is:  "+str);
   
    for(int i=0; i<str.length(); i++){
    char ch=str.charAt(i);
    if(ch>='A' && ch<='Z'){
    upper++;
    }
    else{
    lower++;
    }
    }
    System.out.println("lowercase letters: "+lower);
    System.out.println("uppercase letters: "+upper);
	}

}
