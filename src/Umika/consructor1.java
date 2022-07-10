package Umika;

public class consructor1 {
	
	consructor1(){
		System.out.println("I am a constructor");
		}
	public void Test(){
		System.out.println("I am a methiod");
		
	}
	public static void main(String args[])
	{
		consructor1 obj=new consructor1();
		obj.Test();
		obj.Test();
		obj.Test();
		obj.Test();
		consructor1 obj2=new consructor1();
	}
}
