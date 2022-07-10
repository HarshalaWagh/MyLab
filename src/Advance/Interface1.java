package Advance;

public interface Interface1 {
	int a=10;
	final int b=29;
	public void demo1();//no need of abstract
	
	public void demo2();//cannot complete non static method
	
	public static void demo3() //we can write static method in interface but it should be completed
	                          //it is valid from java version 8
	                          //not valid before java version 7
	{    
	
		System.out.println("I am static method in interface");
	}
	//public static void demo4();//cannot write incomplete static method
	
	public static void main(String args[]) {
		Interface1.demo3();
		
		System.out.println(Interface1.a);

		System.out.println(Interface1.b);
		
	}
	
	

}
