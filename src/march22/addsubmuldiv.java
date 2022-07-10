package march22;

public class addsubmuldiv {

	public static void main(String[] args) {
	
    int a=5,b=15,c=3,d=2,e=8;
	double h;
	h=a + b / c * d - e % c;
	System.out.println("Output is"  +h);
     c=a-b;
	System.out.println("Output of Substraction is"  +c);
	c=a*b;
	System.out.println("Output of Multiplication is"  +c);
	h= (double)a/b;
	System.out.println("Output of Division is"+c);
	c=a%b;
	System.out.println("Output of Remainder is"+c);
	

	
}
}