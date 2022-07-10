package Advance;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please write correct login credentials");
		System.out.println("Pls enter correct username");
		String username=scan.nextLine();
		System.out.println("Pls enter valid password");
		String password=scan.nextLine();
		
				if(username.equals("Umika")&&password.equals("sandesh123"))
				{
					System.out.println("Pls enter the amount");
					int amount=scan.nextInt();
					System.out.println("Collect your amount");
				}
				else
				{
					System.out.println("You have enter wrong credentials");
				}


	
	}

}
