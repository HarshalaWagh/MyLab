package Advance;

public class Implementation1 implements Interface1 {

	public void demo1() {
		System.out.println("I am demo1 method in interface");
		
	}

	public void demo2() {
		System.out.println("I am demo2 method in interface");
	}
	 public static void main(String[] args) {
		Implementation1 obj= new Implementation1();
		obj.demo1();
		obj.demo2();
		//Implementation1.demo3();//Implementation class completes only uncomplete methods of interface
	}


}
