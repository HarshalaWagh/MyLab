package SirQuestionsString;

import java.util.Arrays;

public class TrywithFinallyBlock{ 
	public static int method() {
		try {
			System.out.println("try");
			return 10;
		}
		finally {
			System.out.println("finally");
		}
	}
	 public static void main(String args[]) {
System.out.println(method());
}
}
	 