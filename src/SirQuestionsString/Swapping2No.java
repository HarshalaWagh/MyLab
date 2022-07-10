package SirQuestionsString;

public class Swapping2No{

	public static void main(String args[]) {

//Without 3rd variable
    int a=10;
    int b=20;
    a=a+b;
    b=a-b;
    a=a-b;
    
    //With 3rd variable
    int e;
	int c=100;
	int d=200;
    e=c;
    c=d;
    d=e;
    
    System.out.println(c +" " +d);
    System.out.println(a +" " +b);
	}
}

