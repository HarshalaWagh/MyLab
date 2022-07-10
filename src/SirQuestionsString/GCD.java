package SirQuestionsString;

public class GCD {
	public static void main(String[] args) {

	    // find GCD between n1 and n2
	    int n1 = 12, n2 = 30;
	   
	    int gcd = 1;

	    for (int i = 1; i <= n1 && i <= n2; ++i) {

	      // check if i perfectly divides both n1 and n2
	      if (n1 % i == 0 && n2 % i == 0)
	        gcd = i;
	    }

	    System.out.println("GCD is " + gcd);
	  }
}

