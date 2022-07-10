package Advance;

public class ReturnType {
	public String S1() {
		String a1="I am Harshala ";
		String a2="I am from Pune";
		String a3=a1.concat(a2);
		System.out.println(a3);
		return a3;
	}
	public int S2(String a3) {
		int a=10;
		int b=15;
		int c=a+b;
		System.out.println(c);
		return c;
	}
   public void S3(int c)
   {
	   System.out.println(c);
   }
	public static void main(String args[]) {
		ReturnType obj=new ReturnType();
		obj.S1();
		String result =obj.S1();
		obj.S2(result);
		obj.S3(10);
		
	}
}
