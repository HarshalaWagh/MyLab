package InheritancePack;

public class ParentClass {
	
	int a=200;
	String s="Maharashtra";
	public void Test1(){
		
		System.out.println("I am Parentsclass ");	
	}
	public static void Test2() {
		System.out.println("I am static method");
	}
	ParentClass(int x,int y){
		
		System.out.println(x+y);
	}
	public static void main(String arrg[]) {
		ParentClass obj=new ParentClass(20, 15);
		obj.Test1();
		ParentClass.Test2();
		System.out.println(obj.a);
		System.out.println(obj.s);
		
		}
		
	}


