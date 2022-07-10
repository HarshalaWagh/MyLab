package InheritancePack;
public class ChildClass  extends ParentClass{
	
	public void demo() {
		System.out.println("I am child class");
	}
	/*public ChildClass(){
		System.out.println("Harshala");
	}*/
	public ChildClass(int s,int t)
	{super(15,100);
		System.out.println(s+t);
	}

public static void main(String arrg[]) {
	
		ChildClass obj1=new ChildClass(20,30);
		obj1.demo();
		obj1.Test1();
		System.out.println(obj1.a);
		System.out.println(obj1.s);
}
}
