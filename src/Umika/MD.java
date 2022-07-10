package Umika;

public class MD {
	
	static int a=20;//non static variable
	static int b=30;//static variable
	public static void poonam()//static method
	{
		
		System.out.println("Hii its Poonam ");
	}
	public void porma() //non static method
	{
		System.out.println("Hii its Porma");
	
		
	}
		public void pooja() //non static method
		{
			
			System.out.println(MD.a);
			System.out.println(MD.b);
			
			MD.poonam();
			MD md = new MD();
			md.porma();
			
		}
		
		
		public static void main(String args[]) {
		MD.poonam();
		MD obj=new MD();
		obj.pooja();
			
		}
	
}
