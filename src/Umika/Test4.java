package Umika;

public class Test4 {

	int a,b,c,d;
	public void view()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String args[]) {
		Test4 obj=new Test4();
		obj.a=20;
		obj.b=40;
		obj.c=80;
		obj.d=50;
		obj.view();	
		
		Test4 obj1=new Test4();
		obj1.a=120;
		obj1.b=420;
		obj1.c=802;
		obj1.d=502;
		obj1.view();	
			
	}
	}
