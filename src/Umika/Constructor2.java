package Umika;

public class Constructor2 {
	
	int a;
	String s;
	public Constructor2 (){
	    a=10;
		s="I am full";}
		public Constructor2 (int z,String x){
		    a=z;
			s=x;
		 
		}
	public void Test(){
		System.out.println(a);
		System.out.println(s);
		
	}
	public static void main(String args[])
	{
		Constructor2 obj=new Constructor2();
		Constructor2 obj1=new Constructor2(200,"I hope you are fine");
		obj.Test();
		obj1.Test();
		
		
		
		
		
		
	

	}
}

