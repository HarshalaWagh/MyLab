package InheritancePack;

public class ClassB extends ClassA {
	public void A1() {
		int a=30;
		System.out.println(a);	
	}
	public static void main(String arrgs[])
	{
		ClassB obj=new ClassB();
		obj.A1();
		System.out.println(obj.b);
	}

}
