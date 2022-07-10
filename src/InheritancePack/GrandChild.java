package InheritancePack;

public class GrandChild extends ChildClass {
	public GrandChild(int z) {
	super(100,20);
	System.out.println(z);
	}
	public void Gchild(){
		System.out.println("I am Grandchild");
	}
	public static void main(String arrg[]) {
		GrandChild obj2=new GrandChild(20);
		obj2.Gchild();
		obj2.Test1();
		System.out.println(obj2.a);
		System.out.println(obj2.s);
		
	}

}
