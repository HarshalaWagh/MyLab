package Umika;

public class Constructor3 {// Create a Main class
		  int x;  // Create a class attribute

		  // Create a class constructor for the Main class
		  public Constructor3() {
		    x = 5;  // Set the initial value for the class attribute x
		  }

		  public static void main(String[] args) {
			  Constructor3 myObj = new Constructor3(); // Create an object of class Main (This will call the constructor)
		    System.out.println(myObj.x); // Print the value of x
		  }
		}

